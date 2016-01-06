package main.scala.Tutorial.Chapter17

trait Queue[T]{
  def head: T;
  def tail: Queue[T];
  def append(xs: T): Queue[T];
}

object Queue{
  def apply[T](xs: T*): Queue[T] = new QueueImp(xs.toList,Nil);
  
  private class QueueImp[T](
      leading: List[T], trailing: List[T])  extends Queue[T]{
    val l = leading;
    val t = trailing;
    def normalize = {
      if (leading.isEmpty)
        new QueueImp(trailing.reverse, Nil);
      else
        this;
    }
    
    def head: T =  normalize.l.head;
    
    def tail: Queue[T] = {
      val q = normalize;
      new QueueImp(l.tail,q.t);
    }
    
    def append(x: T) =
       new QueueImp(this.l, x :: this.t)    
    
    
  }
}