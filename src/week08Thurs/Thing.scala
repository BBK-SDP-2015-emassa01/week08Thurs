package week08Thurs

object Thing extends App{
  
  /*
   * dog biscuits?
   * formal parameters
   * -call-by-ref
   * -call-by-value
   * both the above evaluate their parameters
   * 
   * call-by-name
   * delayed evaluation (lazy eval)
   * 
   */

  def methName(eval: => Boolean) = { //: is a call-by-name thingy, the => is the return type, anonymous function
    //added this
    println(eval)
    if (eval) {
      println("ug")
    } else {
      println("foo")
    }  
  }
methName (1==1)
var count =1
methName({println( "ddd"); count == 1})

count +=1
methName (count ==1)

var c =1
while(c <= 5 ){
  println(s"value $c")
  c +=1
}

// *******
//lets try and write a while statement

def xxx(conditional: => Boolean, body: =>Unit)= {
  /*
   * takes 2 parameters
   * 2 call-by-name parameters
   * one of which boolean, and another which is unit
   */
}
def yyy(i: Int, j:Int):Int = i+j
println(yyy(3,4))
//currying
def yyyCurry(i: Int)(j:Int):Int = i+j
println(yyyCurry(3)(4)) //just another way to present this function.
// *******



//call by name is a good idea because it evaluates the method each time it runs into it.
// *******
def xxxCallByName(conditional: => Boolean)( body: =>Unit) :Unit = {
if(conditional){
  body
  xxxCallByName(conditional)(body)
} //every time it encounters it, it evaluates it.
}

var num =1
xxxCallByName(num <= 5 ){ //from this curly brace
  println(s"value $num")
  num +=1
}//to this one, that is the Body

// *******


// *******
//need to be able to do ASYNCHRONOUS AND INFINITE STREAMS (I WANT ALL THE PRIME NUMBERS - BUT INFINATE!), 
// AND ALSO FUTURES.

// *******


















}