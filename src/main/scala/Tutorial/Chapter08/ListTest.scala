package main.scala.Tutorial.Chapter08

class ListTest {
  val l = List(1,2,4,5,10,-1,20,24);
  
  def printListFilter(){
    l.foreach { x => if(x>2) println(x) }
  }
  
  def printListPlaceHolder(){
    val lf = l.filter { _ > 10 }
    lf.foreach { x => println(x) }
  }
  
  
}