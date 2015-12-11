package main.scala.Tutorial.Chapter09

/*
 * Este capitulo deberiamos volver a leerlo
 */
object init09 {
  def main(args: Array[String]){
    val rc = new ReducingCode();
    
    //val value = rc.matcherContains("ini");
    val value = rc.matcherEndWith(".scala");
    value.foreach { x => println(x.getName()); }
    println(rc.containLetter("c"));
    println();
    
    val c = new Carried();
    val Position1 = _c.CurriedSum("lala");
    val Position2 = c.CurriedSum("lili")("lulu");
    println(Position1("lolo"));
    println(Position2);
    println();
    
    val ns = new NewStructures();
    val palabras = ns.FilterEnd("a"); 
    palabras.foreach { println(_); }
    
    
  }
}