package main.scala.Tutorial.Chapter01

class Chapter01 {
  def MM01map() : Map[String,String] = {
    var capitales = Map("US" -> "Washington", 
                        "France" -> "Paris");
    capitales += ("Argentina" -> "Buenos Aires");
    return capitales;               
  }
  
  def MM01Factorial(x: BigInt) : BigInt = {
    if (x==0) return 1 else  return (x * MM01Factorial(x-1));
  }
  
  def MM01UpperCase(x : String) : Boolean = {
    return x.exists(_.isUpper);
  }
  
}
//actor{
//  var sum = 0 
//  loop{
//    
//  }
// }

