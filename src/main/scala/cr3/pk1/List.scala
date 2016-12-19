package cr3.pk1

/**
  * Created by Amit on 12/18/16.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
