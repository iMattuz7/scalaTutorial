package main.scala.Tutorial.Chapter10

abstract class Element{
  def contents: Array[String];
  def width: Int = if(height ==0) 0 else contents(0).length;     
  def height: Int = contents.length;
  def above(that: Element): Element 
  def beside(that: Element): Element
      
}