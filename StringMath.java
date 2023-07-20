
import java.util.*;  
class StringMath  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);
System.out.print("Enter a string: ");  
String str= sc.nextLine();  
  for(int i=0;i<str. length();i++){
char ch = str. charAt(i);
System. out. println("ASCII value of " + ch + " is - " + (int)ch);
}
             
}  
}  