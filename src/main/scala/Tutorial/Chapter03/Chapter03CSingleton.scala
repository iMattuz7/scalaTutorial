class Texto{
	def Escribir(str: String){
		val txt = Texto.escribir(str);
		println(txt);
	}
}

object Texto{
	def escribir(s: String) = s + " Agregado por el Singleton";
}

