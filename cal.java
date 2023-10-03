import java.util.Scanner;
public class cal
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("enter the operations");
String input = s.nextLine();
String[] parts = input.split("[+\\-*/]");
if(parts.length !=2)
{
System.out.println("invalid");
return;
}
double num1 = Double.parseDouble(parts[0]);
double num2 = Double.parseDouble(parts[1]);
char opeartor = input.charAt(parts[0].length());
double result =0.0;
switch(opeartor)
{
case"+":
result = num1+num2;
break;
case"-":
result = num1-num2;
break;
case"*":
result = num1*num2;
break;
case"/":
if(num2==0)
{
System.out.println("not allowed");
return;
}
result = num1/num2;
break;
default:
System.out.println("Invalid operator");
return;
}
System.out.println("result is" +result);
}
}
