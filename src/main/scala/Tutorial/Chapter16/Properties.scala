package main.scala.Tutorial.Chapter16

class Properties {
  private[this] var h: Int =0;
  private[this] var m: Int =0;
  
  //getter 
  def hour: Int = h;
  def minute: Int = m;
  
  //setter
  def hour_=(h: Int) { assume(0 <= h && h < 24); this.h = h}
  def minute_=(m: Int) { assume(0 <= m && m < 60); this.m = m }
}