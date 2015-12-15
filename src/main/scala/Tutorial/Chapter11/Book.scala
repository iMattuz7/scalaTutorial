package main.scala.Tutorial.Chapter11

class Book(val author: String, val title: String) extends Ordered[Book] {
  //le inserta comportamiento a los <> 
    
  override def equals(that: Any) = 
    that match {
    case that: Book => (that.author == this.author) &&
      (that.title == that.title);
    case _ => false;
    }
  
  def compare(that: Book): Int = 
    if (this.author < that.author) -1
    else if (author > that.author) 1
    else if (title < that.title) -1
    else if (title > that.title) 1
    else 0
}
    
  
  
  
  
