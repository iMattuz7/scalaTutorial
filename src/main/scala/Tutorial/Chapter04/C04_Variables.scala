package main.scala.Tutorial.Chapter04

class C04_Variables {
  def CheckVariables() : String ={
    val a = "hola";
    {
      val a = "chau";
    }
    return a;
  }
  
  def printMultiTable() {
    for (i <- 1 to 10){
      for(j <- 1 to 10){
        val prod = (i*j).toString();
        println(String.format("%4s", Array(prod)));
      }
      println();
    }
    println();
  }
}