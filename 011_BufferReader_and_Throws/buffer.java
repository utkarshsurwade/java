import java.io.*;
class buffer
{
 public static void main(String args[])throws IOException
//throws:an exception that is thrown out of method must be specified by throws keyword
 {

 InputStreamReader irs=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(irs); 
 String s=br.readLine();
 System.out.println(s);
}
}
