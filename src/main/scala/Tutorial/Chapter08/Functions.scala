package main.scala.Tutorial.Chapter08

class Functions {
  def TestNestedFunction(nombre: String, edad: Int, isAMan: Boolean){
    val str = { if(edad>=18) "es mayor de edad" else "es menor de edad"}
    def Sexo(isAMan: Boolean) : String = {
      if(isAMan) "Hombre" else "Mujer"  
    }
    def escribir() {
      println("El nombre es" + nombre + " " +
          "Tiene " + edad + "Anios " + 
          str + " y es un " + Sexo(isAMan))
          
    }
    escribir();
  }
}