package week08Thurs

object ExpensiveResource extends App {
lazy val resource :Int = init()
// val resource :Int = init()

// *******
def init() :Int ={
  //do something expensive
  println("Ouch")
  0
}

println(resource)

//don't even use it! We want it to be called WHEN we use it, not just anyway!
//stick lazy in front of it! As long as it is a val, that way it will only be evaluated when you need it.
// If its a car, it will only be evaluated the first time, which may not make sense for this type of thing.
// *******
}