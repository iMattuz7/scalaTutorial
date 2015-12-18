package main.scala.Tutorial.Chapter13
import main.scala.Tutorial.Chapter13.Test._

class Test2 {
  def print(){
    val test = new Test1();
    println(test.Saludar());
    //test.Saludar2 esto no funciona porque es privado 
  }
  
}