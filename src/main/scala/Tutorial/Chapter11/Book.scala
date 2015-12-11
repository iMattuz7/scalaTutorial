package main.scala.Tutorial.Chapter11

class Book(val author: String, val title: String) {
  //le inserta comportamiento a los <> 
  def < (that: Book) = (this.author < that.author) || 
  ((this.author == that.author) && (this.title < that.title));
  
  def > (that: Book) = that < this;
  
  def <= (that: Book) = (that < this) || (that == this);
  
  def >= (that: Book) = (that > this) || (that == this);
  
  override def equals(that: Any) = 
    that match {
    case that: Book => (that.author == this.author) &&
      (that.title == that.title);
    case _ => false;
    }
}
    
  
  
  
  
