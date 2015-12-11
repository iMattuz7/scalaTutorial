package main.scala.Tutorial.Chapter06

class Constructor(h: String,c: String ) {
  def this(h: String) = this(h,"");
  def this() = this("","");
  val hola = h;
  val chau = c;
  
  override def toString() = "el mensaje es: " + hola + chau;
  
  
  def PruebaLazy(str: => String): Unit ={
    lazy val x = str + "123";
    
    
    println(x);
  }
  
  def testLazy(){
    val x = { print ("foo") ; 10 }
    print ("bar");
    print (x);
    print (x);
    
    println();
    
    lazy val xx = { print ("foo2") ; 20 }
    print ("bar2");
    print (xx);
    print (xx);
  }
  
}