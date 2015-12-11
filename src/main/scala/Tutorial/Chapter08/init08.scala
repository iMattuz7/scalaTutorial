package main.scala.Tutorial.Chapter08

object init08 {
  def main(args: Array[String]){
  val luciana = new {val nombre = "Luciana";val edad =  23;val isAMan = false;} 
  val matias = new {val nombre = "Matias";val edad =  16; val isAMan = true;}
  val fuct = new Functions();
  
  //  Test Luciana
  fuct.TestNestedFunction(luciana.nombre,luciana.edad,luciana.isAMan);
  
  //  Test Matias
  fuct.TestNestedFunction(matias.nombre,matias.edad,matias.isAMan);
  println()
  
  //Ejercicio 2
  val fc = new FirstClassFunction();
  val value1 = fc.Increment(10);
  println(value1);
  val value2 = fc.Increment(10);
  println(value2);
  println(fc.Increment);
  
  println()
  //Ejercicio 3
  val f = new ListTest();
  f.printListFilter();
  f.printListPlaceHolder();
  
  println()
  //Ejercicio 4
  val ph = new PlaceHolder();
  ph.printSum(1, 2, 3);
  ph.printV();
  
  //ejercicio 5
  val rp = new RepeatParams();
  val str1 = "hola";
  val str2 = "chau";
  rp.rParam(str1);
  println();
  rp.rParam(str1,str2);
  
  //ejercicio 6 Tail Recursion
  val tr = new TailRecursion();
  tr.PrintTail();
  
  
  }  
}