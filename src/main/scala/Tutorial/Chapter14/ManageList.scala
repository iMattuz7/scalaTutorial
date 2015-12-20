package main.scala.Tutorial.Chapter14

class ManageList {
  val list1 = List(2, 4, 1, 5, 8, 9, 12, 3);
  val list2 = List("asd", "dsa");
  val list3 = List(List(1, 2, 3), List(3, 2, 1));
  val list4 = List();

  def ContructoresDeListas() {
    val strs = "asd" :: ("bsd" :: ("asd" :: Nil));
    val nums = 1 :: 2 :: 3 :: 4 :: Nil;
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)));

    //Operations
    val str = strs.head; //devuelve String
    val strtail = strs.tail; //devuelve List[String]
    val strisEmpty = strs.isEmpty; //devuelve si esta vacia
  }
  
  def print(){
    println(iSort(list1));
  }
  

  def iSort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) Nil;
    else {
      insert(xs.head, iSort(xs.tail))
    }
  }
  def insert(x: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty || x <= xs.head) x :: xs;
    else xs.head :: insert(x, xs.tail);
  }
  
  def appendList[T](xs: List[T], ys: List[T]): List [T] = xs match{
    case List() => ys;
    case x :: xs1 => x :: appendList(xs1, ys)
  }
  
  def operaciones(){
    //list1.head devuelve el primer elemento 
    //list1.tail devuelve todos los elementos menos el primero
    //list1.init devuelve todos los elementos menos el ultimo
    //list1.last devuelve el ultimo elemento
    //list1.reverse devuelve todos los elementos pero al revez
    val todoMenosLos2Primeros = list1.drop(2);
    val soloLosPrimerosX = list1.take(2); //X == 2
    val res = list1.splitAt(3);
    val listaCortada1 = res._1;
    
  }

}