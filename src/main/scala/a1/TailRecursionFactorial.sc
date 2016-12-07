// Simple Implementation of factorial

def factorial(number: Int): Int =
  if(number == 1)
    1
  else
    (number * factorial(number - 1))

factorial(3)
factorial(5)

//Tail recursion version for optimization purpose

def factorialTailRecursion(number: Int): Int = {
  def factorialInner(number: Int, multiple: Int): Int = {
    if(number == 1)
      multiple
    else
      factorialInner(number - 1, number * multiple)
  }
  factorialInner(number, 1)
}

factorialTailRecursion(5)