package main.scala.Tutorial.Chapter06

class Rational(n: Int, d: Int) {
  def this(n: Int) = this(n,1);
  private val g = gcd(n,d);
  val numerator = n / g;
  val denominator = d / g;
  
   private def gcd(n: Int, d: Int): Int = 
      if(d == 0) n else gcd(d, n % d)
  
  def add(x: Rational): Rational = new Rational(numerator * x.denominator + 
                                                x.numerator * denominator, 
                                                denominator * x.denominator);
  
  def seb(x: Rational): Rational = new Rational(numerator * x.denominator +
                                                x.numerator * denominator,
                                                denominator * x.denominator);
  
  def mul(x: Rational): Rational = new Rational(numerator * x.numerator,
                                                denominator * x.denominator);
  
  def div(x: Rational): Rational = new Rational(numerator * x.denominator,
                                                denominator * x.numerator);
  
 
      
  
  
//  override def toString(): String = {
//    return this.numerator.toString() + "/" + this.denominator.toString();
//  }
  
  //otra forma
  override def toString() = numerator + "/" + denominator;
  
  
                                                         
}