package main.scala.Tutorial.Chapter12

object init12 {
  def main (args: Array[String]){
    //first exercise
    val v = Var("hola");
    val op = BinOp("Operator",Number(1.0d),Var("chau"));
    println(v.name);
    println(op.left);
    //2nd exercise
    val tm = new TupleMatch();
    tm.MatchTest();
    tm.MatchTest2("hola")
    
    //MatchTypes
    val mt = new OptionType();
    val miList = List("Edu","Matias");
    val x = Option[Any](null); 
    println(mt.show(mt.TestMap().get(null)));
    println(mt.show(x));
  }
}