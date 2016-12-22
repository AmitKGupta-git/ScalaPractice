package cr4

/**
  * Created by Amit on 12/20/16.
  */
abstract class IntSet {
  def foo = 1
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  override def foo: Int = 4
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  def contains(x: Int): Boolean = false

  override def toString: String = "."
}
// Making this singleton object as we just need one IntSet empty
// to avoid the overkilling user to create multiple Empty IntSet
/*object Empty extends IntSet {
  override def foo: Int = 4

  // Note: passed argument. No need to say new Empty.
  // Singleton object is value so it replaces the value directly
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  def contains(x: Int): Boolean = false

  override def toString: String = "."

  override def union(other: IntSet) = other
}*/

class NonEmpty(element: Int, left: IntSet, right: IntSet) extends IntSet {
  override def incl(x: Int): IntSet =
    if (x < element) new NonEmpty(element, left incl x, right)
    else if (x > element) new NonEmpty(element, left, right incl x)
    else this

  override def contains(x: Int): Boolean =
    if (x < element) left contains x
    else if (x > element) right contains x
    else true

  override def toString: String = "{" + left + element + right + "}"

  override def union(other: IntSet) =
    ((left union right) union other) incl element
}


