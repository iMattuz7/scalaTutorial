package main.scala.Tutorial.Chapter14

object init14 {
  def main(args: Array[String]){
  val ml = new ManageList();
  ml.print();
  
  //Try an Append
  val miList1 = List (1,2,3);
  val miList2 = List (4,5,6);
  val miListRes = ml.appendList(miList1, miList2);
  println(miListRes);
  println(ml.Zipped());
  
  //creando un string a gusto
  println(miList1.mkString("init" ,"///","fin"));
  
  println(ml.operationsPartII());
  
  println(ml.flatterm(List(List(1,2,3))));
  }
}