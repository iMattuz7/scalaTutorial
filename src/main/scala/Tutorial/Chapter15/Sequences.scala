package main.scala.Tutorial.Chapter15

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable._



class Sequences {
  def testArray(){
    val numbers = new Array[Int](5);// crea un array de 5 elementos valor 0
    val number = numbers(3);//devuelve el 4to elemento
    numbers(3) = 13;
    numbers.update(3, 15);//actualizo el 4to valor a 15
    for (x <- numbers)
      println(x);
    
  }
  
  def testArrayBuffers(){
    val buf = new ArrayBuffer[Int]();
    buf += 12;
    buf += 15;
    val firstval = buf(0);
  }
  
  def converts(){
    val lst = List(1,2,3);
    val arrayFromList = lst.toArray;
    val lstFromArray = arrayFromList.toList;
    
  }
  
  def testSetMaps(){
    val emptyset = Set.empty[String];
    emptyset += "hola";
    emptyset += "como te va?";
    emptyset += "chau";
    emptyset ++= List("hola","chau");//esto no se va a agregar
    //solo agrega elementos diferentes
    
    //Maps
    val emptymap = Map.empty[String,Int];
    emptymap("hola") = 1;
    emptymap("chau") = 2;
    emptymap ++= List("puto" -> 3, "forro" -> 4);
    
    
    
    
    
  }
}