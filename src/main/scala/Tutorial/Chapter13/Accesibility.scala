package main.scala.Tutorial.Chapter13

class Accesibility {
  def publico() = "asd";
  protected def protegido() = "asd";
  private def privado() = "asd"
  
  this.privado()//Acceso al privado
  
}
/*
 * Solo ve los publicos
 */
class hijo1 {
    (new hijo1)//NO VE NADA ;
    (new Accesibility).publico(); //puedo acceder al public
}

class hijo2 extends Accesibility {
  (new hijo2).protegido()//accedo al protedigo
}