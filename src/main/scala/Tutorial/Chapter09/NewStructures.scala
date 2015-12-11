package main.scala.Tutorial.Chapter09

class NewStructures {
  val palabras = List("aaaa","aaa", "aaas", "bbb");
  def FilterInit(str: String => Boolean, str2: String) = {
    for(palabra <- palabras; if(str(palabra) && palabra.endsWith(str2)))
      yield palabra;
  }
  
  def FilterEnd(str: String) = {
    FilterInit(_.startsWith(str),"a")
  }
  
}