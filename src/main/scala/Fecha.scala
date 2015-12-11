package main.scala

class Fecha(y: Int, m: Int, d: Int){
  def Year = y;
  def Mounth = m;
  def Day = d;
  
  override def toString() : String = Year + "-" + Mounth + "-" + Day;
  
  override def equals(that: Any) : Boolean = 
    that.isInstanceOf[Fecha] && {
    val o = that.asInstanceOf[Fecha];
    o.Day == Day && o.Mounth == Mounth && o.Year == Year;
  }
  
  
}