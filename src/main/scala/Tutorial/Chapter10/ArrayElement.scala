package main.scala.Tutorial.Chapter10

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts;
  
  def above(that: Element): Element = {
    return this;
  } 
  def beside(that: Element): Element = {
    return this;
  }
  
}