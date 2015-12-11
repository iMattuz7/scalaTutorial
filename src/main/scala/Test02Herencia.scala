package main.scala

abstract class Test02Herencia {
  type Enviroment = String => Int;
}

case class Sumar(dato1 : Test02Herencia, dato2 : Test02Herencia) extends Test02Herencia{
  
}

case class Numero(valor1 : Int) extends Test02Herencia {
  
}



case class Palabra(valor1 : String) extends Test02Herencia {}

class DosNumeros(valor1 : Int , valor2 : Int) extends Test02Herencia{}
