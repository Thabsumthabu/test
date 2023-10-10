import java.util.Scanner;
public class cal5
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);

System.out.println("enter the operaation");
String input = s.nextLine();

char operator = calfound(input);
//double varibledeclartion = variableDec(input);
  double results = calculatorSwitch(operator,input);
 System.out.println("result is" +results);
}
 static char calfound(String input)
{
char operator = ' ';
int indexfound = -1;

for(int i=0;i<input.length();i++)
{
char c = input.charAt(i);
if(c == '+')
{
operator = c;
indexfound = i;
break;
}
else if(c == '-')
{
operator = c;
indexfound = i;
break;
}
else if(c == '*')
{
operator = c;
indexfound = i;
break;
}
else if(c == '/')
{
operator = c;
indexfound = i;
break;
}
}
if(indexfound == -1 || indexfound > 3)
{
System.out.println("inavlid");
return ' ';
}

return operator;
}
static double[] variableDec( String input,char operator)
{
int indexfound = input.indexOf(operator);
        if (indexfound == -1) {
            return 0.0; 
        }
String first = input.substring(0,indexfound).trim();
String second = input.substring(indexfound+1).trim();
double num= Double.parseDouble(first);
double num2 = Double.parseDouble(second);
//double result=0.0;
return new double[] { num, num2};
}

static double calculatorSwitch(char operator,String input)
{
double[] numbers = variableDec(input,operator);
switch(operator)
{
case'+':
return numbers[0]+numbers[1];

case'-':
return  numbers[0]-numbers[1];
}

}
}
