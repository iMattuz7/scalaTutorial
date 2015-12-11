package main.scala.Tutorial.Chapter03

object init03 {
  def main(args: Array[String])  {
    
    
    val z = new C03TraitClass2();
    val y = new C03TraitClass2() with C03Trait2;
    val x = new C03TraitClass();
    println("valor z " + z.Saludo());
    println("valor y " + y.Saludo());
    println("valor x " + x.Saludo());
    println("valor x " + x.Chau());  
    
  }
}