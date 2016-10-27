class circle extends shape
{
 int radius;
 float area; 
 void input()
 {
 System.out.println("enter radius");
 radius=sc.nextInt();
 }

 void calculate_c()
 {
 area=3.14f*radius*radius;
 }

 void display()
 { 
 super.display();
 System.out.println("area="+area);
 }
}
