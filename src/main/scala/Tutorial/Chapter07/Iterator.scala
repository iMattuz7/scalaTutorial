package main.scala.Tutorial.Chapter07

import scala.collection.mutable.MutableList
import java.io.File

class Iterator {
  def ListFile(): Array[File] = {
    val files = new java.io.File("/Users/matiasalmiron/workspace/MA_ScalaTutorial/src/main/scala").listFiles().filter { x => x.getName.endsWith(".scala") } 
    //var files: Array[File] = null;
    return files;
//    for ( 
//          l <- files){ 
//        if(l.isFile());
//        if(l.getName().endsWith(".scala"))
//            ){
//      println(l);
        
//    }
  }
  
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines
  
  def grep(str: String){
    val files = ListFile();
    for( f <- files){
      val lines = scala.io.Source.fromFile(f).getLines();
      val res = lines.foreach { x => if(x.contains(str)) println(x)}

//      for (l <- lines){
//        if(l.contains(str))
//          println(l);
//      }       
    } 
    
    
  }
  
  def TestLaze(str: String){
    var list = new MutableList[String]();
    
    list += "lala";
    list += "lolo";
    
    val s = str;
    list += s;
    println(list.foreach { x => x.toString() });
    
    
    
    
  }
}