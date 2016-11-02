class Maxormin
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int c=Integer.parseInt(args[2]);

     if( a > b && a > c ) 
     { 
     System.out.println("greatest is "+a);
     }
     else
     {
         if(b>c)
         {
         System.out.println("greatest is "+b);
         }
          else
  	 {
         System.out.println("greatest is "+c);
  	 }
    }
 


     if( (a < b) && (a < c ) )
     {
     System.out.println("smallest is "+a);
     }
     else
     {
         if(b<c)
         {
         System.out.println("smallest is "+b);
         }
          else
         {
         System.out.println("smallest is "+c);
         }
    }



} 
}
