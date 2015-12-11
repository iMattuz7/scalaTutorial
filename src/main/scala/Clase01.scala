package main.scala

class Clase01 {
  
}

class Clase02(nombre : String , edad : Int){
  def edadVal() = edad;
  def nombreVal() = nombre;
  
  override def toString() = "Nombre: " + nombreVal() + " Edad: " + edadVal();
  
}
