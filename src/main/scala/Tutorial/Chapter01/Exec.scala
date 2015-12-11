package main.scala.Tutorial.Chapter01

object Exec {
  def main(args: Array[String]) {
    val ch01 = new Chapter01();
    val valch01 = ch01.MM01map();
    //termino ejercicio 01 del libro Mostrar la capital de argentina
    println(valch01.get("France").toString());
    
    
    //ejercicio 2 factorial
    val factorial01 = ch01.MM01Factorial(3);
    println(factorial01);
    
    //ejercicio 3 String Upper
    //probando matias
    val isUpperC1 = ch01.MM01UpperCase("matias");
    println("matias " + isUpperC1.toString());
    //Probando Matias
    val isUpperC2 = ch01.MM01UpperCase("Luciana");
    println("Luciana " + isUpperC2.toString());
  }
}