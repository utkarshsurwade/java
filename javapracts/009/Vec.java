import java.util.*;
class Vec
{
 public static void main(String args[])
 {

 Vector v = new Vector(3, 2); //constructor(size,increasing capacity)

 v.addElement(new Integer(33));//1 addElement()
 System.out.println(v.firstElement());//2 firstElement()

 v.addElement(new Float(53f));
 System.out.println(v.lastElement());//3 lastElement()

  System.out.println(v.size());//4 size()

  System.out.println(v.capacity());//5 capacity()

  System.out.println(v.isEmpty());//isEmpty()

 }
}
