package main.scala.Tutorial.Chapter04

/**
 * 
 */
class C04_Calculator {
    private var sum = 0;
    def addValue(x : Byte){
      sum += x;
    }
    def checkSum : Int = {
      return ~(sum & 0xFF) +1;
    }
    
    def ValueSum : Int = {
      return sum;
    }
}