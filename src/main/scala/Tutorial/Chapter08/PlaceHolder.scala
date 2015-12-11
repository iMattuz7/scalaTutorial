package main.scala.Tutorial.Chapter08

class PlaceHolder {
  val values = List(1,2,3);
  
  def printV(){
    values.foreach { println(_) }
  }
  
  def sum(x: Int, y: Int, z: Int): Int = x + y + z;
  
  def printSum(x: Int, y: Int, z: Int){
    val v = sum(x,y,z);
    println("valor de v" + v);
    val vv = sum(x,_: Int,z)  
    println("valor de vv" + vv(3));
  }
  
  
}