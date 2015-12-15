package main.scala.Tutorial.Chapter12

class TupleMatch {
  def MatchTest() {
    ("hello", 10, true) match {
      case (word, idx, bool)  => println(word,idx); // use word, idx and bool here...
    }
  }
  def MatchTest2(x: Any) {
     x match {
      case x: String  => println(x); // use word, idx and bool here...
    }
  }
}