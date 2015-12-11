package main.scala.Tutorial.Chapter09

class ReducingCode {
  val strs = List("Hola", "Chau");
  val files = new java.io.File("/Users/matiasalmiron/workspace/MA_ScalaTutorial/src/main/scala").listFiles();
  val palabras = List("aaa","aaaa","bbbbb","ccccc","aa", "a");
  
  private def FileMatcher(matcher: String => Boolean) = {
    for (file <- files; if (matcher(file.getName())))
      yield file;
  }

  def matcherEndWith(query: String) = {
    FileMatcher(_.endsWith(query));
  }

  def matcherContains(query: String) = {
    FileMatcher(_.contains(query));
  }

  def printTest() {
    println(strs(1));
  }
  
  def leghtmayor(max: Int) = {
    palabras.foreach { x => if(x.length() > max) x }
  }
  
  def containLetter(ch: String) = {
    palabras.exists(_ == ch);
  }

}