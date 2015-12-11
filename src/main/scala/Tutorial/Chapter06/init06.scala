package main.scala.Tutorial.Chapter06

object init06 {
  def main(args: Array[String]){
    val c = new Constructor("Hola");
    println(c);
    
    val c2 = new Constructor("Hola"," Chau");
    println(c2);
    
    val c3 = new Constructor();
    //c3.hola = "Hola" No se puede modifcar el valor de un val
    //c3.PruebaLazy("hola");
    //c3.PruebaLazy("chau");
    
    //test lazy2
    c3.testLazy();
  }
}