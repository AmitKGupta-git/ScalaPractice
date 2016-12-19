package cr3.pk1

/**
  * Created by Amit on 12/18/16.
  */
class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")

  override def toString: String = "."

}
