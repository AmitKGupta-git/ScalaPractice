package cr3.pk1

/**
  */
object ListTest extends App{
  def singleton[T] (elem: T) =
    new Cons[T](elem, new Nil[T])

  val l1: List[Int] = singleton[Int](1)
  println(l1)

}
