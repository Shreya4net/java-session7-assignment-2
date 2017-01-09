package session7;
import java.util.Scanner;
public class String1 {



public static void main(String args[]){
Scanner sc=new Scanner(System.in);
{System.out.println("Enter the String");
String s=sc.nextLine();
System.out.println("Enter the substring to be searched");
String ss=sc.nextLine();

int count=0;
String s1=s.toLowerCase();
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)=='s'||s1.charAt(i)=='t'||s1.charAt(i)=='r'||s1.charAt(i)=='i'||s1.charAt(i)=='n')
		count++;
		}

System.out.println("No. of substrings in the string are "+count);
if(s.contains(ss))
{
System.out.println("substring found");

}
sc.close();
}
}
}



