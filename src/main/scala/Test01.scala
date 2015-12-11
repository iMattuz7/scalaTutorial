

package main.scala
import java.util.{Locale,Date}
import java.text.DateFormat
import java.text.DateFormat._

class Test01 {
  def Prueba01(){
    val now = new Date;
    val df = getDateInstance(LONG,Locale.US);
    val dfnow = df.format(now);
    println("la hora en USA es: " + dfnow);
    
  }
  
  def PruebaCallBackFunction(callback : () => Unit)   {
     while (true) {callback(); Thread.sleep(10000); }
     
   }
   
  def Luciana( nombre : String, edad : String)  {
    println("Se llama :" + nombre + "tiene de edad :" + edad); 
  }
  
  def PruebaCallbackFunctionRepeat(callback : () => Unit){
    for( a <- 1 to 3)
    {
     callback(); Thread.sleep(5000); 
    }
  }
   
   //Este metodo se ejecuta pasandolo como parametro a la funcion de Callback
   def Escribiendo(){
     println("Probando callback...");
   }
}

object Test02 {
  def Escribiendo(){
     println("Probando callback...");
   } 
}
