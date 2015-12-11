package main.scala.Tutorial.Chapter08

class TailRecursion {
  val list1 = List(1,2,3,4,5,6,7,8,9);
  val list2 = List(9,8,7,6,5,4,3,2,1);
  
  def functTail(list: List[_]): Int = {
    def functTailAux(list: List[_], len: Int): Int = {
      if(list == Nil) len 
      else functTailAux(list.tail, len + 1)
        
    }
    functTailAux(list, 0);
  }
  
  def PrintTail(){
    val list1 = List(1,2,3,4,5,6,7,8,9);
    val list2 = List("Hola", "chau","lala");
    println(functTail(list1));
    println(functTail(list2));
  }
}

