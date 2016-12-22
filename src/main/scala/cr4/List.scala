package cr4

/**
  * Created by Amit on 12/20/16.
  */
trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty = false
}

class Nil[T] extends List[T] {
  override def isEmpty = true
  override def head = throw new NoSuchElementException("Nil.head")
  override def tail = throw new NoSuchElementException("Nil.tail")
}

object List {
  // List(1, 2) = List.apply(1, 2)

  def apply[T](x1: T, x2: T): List[T] =
    new Cons(x1, new Cons(x2, new Nil))

  def apply[T] (x1: T): List[T] = new Cons(x1, new Nil)

  def apply[T]() = new Nil[T]
}
