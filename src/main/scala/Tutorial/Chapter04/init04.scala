package main.scala.Tutorial.Chapter04

object init04 {
  def main(args: Array[String]) {
    val cal1 = new C04_Calculator();
    cal1.addValue(8);
    cal1.addValue(10);
    println("el valor en negativo: "+ cal1.checkSum);
    println("el valor de la suma: " + cal1.ValueSum);
    
    /**
     * @author matiasalmiron
     * <h1> Prueba </h1>
     */
    val x2 = new C04_Variables();
    println("el valor de la a es:" + x2.CheckVariables());
    
    //MultiTable
    x2.printMultiTable();
  }
}