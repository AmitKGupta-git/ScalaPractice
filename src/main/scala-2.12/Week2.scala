/**
  * Created by amitgupt on 12/11/16.
  */
object Week2 extends App {

  println(sumInts(5, 10))
  println(sum(x => x)(5, 10))
  println(sumCubes(5, 10))
  println(sum(x => x * x * x)(5, 10))

  /**
    * Sum all the integer from a to b.
    * @param f
    * @return
    */
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b:Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  def sumInts = sum(x => x)
  def sumCubes = sum(x => x * x * x)
  //def sumfactorials = sum(fact)

  /*
  Modified syntax
   */
  def sumModified(f: Int => Int) (a: Int, b: Int): Int =
    if(a > b) 0 else f(a) + sumModified(f)(a + 1, b)
}
