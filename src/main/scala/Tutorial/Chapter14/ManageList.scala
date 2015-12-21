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
    //list1.apply(3) Devuelve el 4to elemento 
    
    
  }
  
  def Zipped(): List[(Int,Int)] = {
    list1.zipWithIndex;
  }
  
  def operationsPartII() = {
    val ls1 = List(1,2,3);
    val ls1mas1 = ls1.map { _ + 1 ;}//devuelve List(2,3,4)
    
    val lst = List("hola","chau","lol");
    val lstFilter = lst.filter { _.length() == 4 ;} //return hola,chau
    val lstPartition = lst.partition { _.length() == 4 ;}
    //lstPartition._2; devuelve el resultado de la lista que no coincide con lo que se busco
    //lstPartition._1; devuelve el resultado que si coincide
    val lstFind = lst.find { _.length() == 4 ;}//devuelve el primer elemento que cumple la regla
    
   //TAKEWHILE
    val lstBIG = List(1,2,3,4,5,6,7,8);
    val lstTakeWhile = lstBIG.takeWhile { _ < 5 }
    //devuelve los resultados que complen el if hasta que un valor no lo haga
    val lstDropWhile = lstBIG.dropWhile { _ < 5 } 
    val lstSpan = lstBIG.span { _ < 5; }
    //lstDropWhile;
    //lstSpan._1;// == takeWhile // _2 == dropWhile
    
    //FOLD
    val lststr = List("hola","como","te","va");
    val listfold1 = ("" /: lststr)(_ + " " + _);
    val lstInt = List(2,2,2,2);
    val lstSUM = (0 /: lstInt)(_ + _)
    val lstSUM2 = (lststr :\ "222")(_ +" "+ _);
    lstSUM;
    //FOLD mas concatenate  
    
    
    
    
  }
  
  def flatterm[T](xss: List[List[T]]) = (List[T]() /: xss)(_ ::: _)
  
  
  

}