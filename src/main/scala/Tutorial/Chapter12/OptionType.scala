package main.scala.Tutorial.Chapter12

class OptionType {
  def TestMap() ={
    val miMap = Map("France" -> "Paris", "Japan" -> "Tokio");
    miMap;  
  }
  
  def show(x: Option[Any]) = x match{
    case Some(s: String) => s;    
    case None => "!!!!";
    case _ => "???"
  }
}