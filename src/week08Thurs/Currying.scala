package week08Thurs

object Currying extends App{
  
  def cat1 (s1:String)(s2:String):String = {
    s1+s2
  }
  
  def cat2 (s1:String) = (s2: String) => s1+s2

  println(cat1("hello")("world"))
  println(cat2("hello"))//println <function1> im a function i take a single argument
  println(cat2("hello")("world"))

  
  //*********************
  val f = cat2 ("Borris")
  val s = f("the spider")
  println(s)
  /*
   * we return a function, then use the apply method to the function.
   */
  //*********************
  
  def addn(n:Int) = (i:Int) => i + n
  
  val add5 = addn(5) //this is the first part that puts the n in, we call this val 'add5', but 
  
  println(add5(15))
  println(add5(13))
  
  val add7 = addn(7)

  println(add7(15))
  println(add7(13))
  
}