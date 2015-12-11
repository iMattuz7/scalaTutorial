package main.scala.Tutorial.Chapter08

class RepeatParams {
  def rParam(strs: String*){
//    for(str <- strs){
//      println(str);
//    }
    strs.foreach { println(_) }
  }
  
}