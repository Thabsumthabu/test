import java.util.*;
public class cal3
{
public static void main(String[] arggs)
{
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println("enter the operation");
String input = s.nextLine();
char operator = charFound(input);
double result = calFound(input,operator);
System.out.println("result" +result);
 
}
}

static char charFound(String input)
{
char operator = ' ';
for(int i=0;i< input.length();i++)
{
char c = input.charAt(i);
int indexfound = -1;
if(c == '+' || c == '-' || c== '*' || c == '/')
{
operator = c;
indexfound = i;
}
}
return operator;
}
static double[] numberFound(String input,char operator)
{
int index = input.indexOf(operator);
if(index == -1)
{
return new double[] {0.0,0.0};
}
double num1 = Double.parseDouble(input.substring(0,index).trim());
double num2 = Double.parseDouble(input.substring(index+1).trim());
return new double[] {num1,num2};
}

static double calFound(String input,char operator)
{
double[] numbers = numberFound(input,operator);
switch(operator)
{
case'+':
return numbers[0]+numbers[1];
case'-':
return numbers[0]-numbers[1];
case'*':
return numbers[0]*numbers[1];
case '/':
if(numbers[1] == 0)
{
System.out.println("not found");
return ' ';
}
return numbers[0]/numbers[1];
default:
return 0.0;
}

}
}
