package main.scala.Tutorial.Chapter11

object init11 {
  def main(args: Array[String]){
    val x = new Object() with Printable();
    val y = new Fog();
    y.print();
    
    val b1 = new Book("author1","title1");
    val b2 = new Book("author1","title1");
    
    val e = b1.equals(b2);
    val c = b1.compare(b2);
    
    println(e + " " + c);
    
  }
}