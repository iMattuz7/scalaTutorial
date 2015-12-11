

package main.scala

object init {
   def main(args: Array[String]) {
  	println("hello")  	
  	val prueba01 = new Test01();
  	prueba01.Prueba01();
  	
  	//LLamo a la funcion que se se pasa como parametro
  	//prueba01.PruebaCallBackFunction { prueba01.Escribiendo }
  	
  	//Probando Funciones Anonimas 
  	//prueba01.PruebaCallBackFunction(() => println("probando funcion anonima"));
  	
  	//Vamos a probar el for
  	//prueba01.PruebaCallbackFunctionRepeat { prueba01.Escribiendo }
  	
  	//Constructor clase con parametros
  	//val c1 = new Clase02("Luciana",23);
  	//println(c1.toString());
  	
  	//Probando Herencia No entendi una mierda aca
  	
//  	val exp1 : Test02Herencia = Sumar(Sumar(Palabra("x"),Palabra("x")), Sumar(Numero(7),Palabra("y")));
//  	val env : Enviroment = {case "x" => 5 case "y" => 7}
//  	println("expresion : " +env);
//  	println("Evaluando los valores x=5 y=7" + (exp1,env));
//  	
  	
  	
  	
  	
  	
  	
  } 
   
   //def eval(t: Test02Herencia, e : Enviroment)
   
   def derive(t: Test02Herencia, v: String) : Test02Herencia = t match {
     case Sumar(l,r) => Sumar(derive(l,v),derive(r,v));
     case Palabra(p) if (v == p) => Numero(1);
     case _ => Numero(0);
   }  
   
   def TestString(){
     println("prueba callback desde el objeto static");
   }
   
}
