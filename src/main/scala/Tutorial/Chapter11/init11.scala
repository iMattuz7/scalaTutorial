package main.scala.Tutorial.Chapter11

object init11 {
  def main(args: Array[String]){
    val x = new Object() with Printable();
    val y = new Fog();
    y.print();
    
  }
}