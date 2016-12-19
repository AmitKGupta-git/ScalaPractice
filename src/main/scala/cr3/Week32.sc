import cr3.pk1._

object Week32 {

  def nth[T] (n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if(n == 0) xs.head
    else nth(n - 1, xs.tail)


  val l1 = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  val a = 1
  val b = 1
  val c = 1
  nth(2, l1)
//  nth(8, l1)

}
