package main.scala.Tutorial.Chapter12

abstract class Hierachy {}
case class Var(name: String) extends Hierachy
case class Number(num: Double) extends Hierachy
case class UnOp(operator: String, arg: Hierachy)
case class BinOp(operator: String, left: Hierachy, right: Hierachy) extends Hierachy

  
