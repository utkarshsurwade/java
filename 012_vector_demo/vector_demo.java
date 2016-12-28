import java.util.*;

class vector_demo
{

public static void main(String args[])
{
Vector v=new Vector(3,2);
System.out.println("initial size="+v.size() );
System.out.println("capacity="+v.capacity());
v.addElement(new Integer(1));
v.addElement(new Integer(2));
v.addElement(new Integer(3));
v.addElement(new Integer(4));
System.out.println("capacity ="+v.capacity());
v.addElement(new Float (1.5));
v.addElement(new Float (2.5));
System.out.println("capacity="+v.capacity());
System.out.println("first element="+v.firstElement());
System.out.println("last element="+v.lastElement());
//vector
/*
Iterator itr=v.iterator();
System.out.println("elements in vector");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
*/

//enumeration
Enumeration e;
e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());

}
}
}


