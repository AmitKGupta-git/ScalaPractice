package cr3.pk1

/**
  * Created by amitgupt on 12/18/16.
  */
class Cons[T] (val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false

  override def toString: String = (head + "->" + tail)


}
