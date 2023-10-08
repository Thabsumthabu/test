import java.util.Scanner;
public class cal2
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
  while (true) {
System.out.println("enter the operation");
String input = s.nextLine();
if (input.length() < 3) {
            System.out.println("Invalid input.");
            return;
        }

        char operation = ' ';
        int operationIndex = -1;
for(int i=0;i<=input.length();i++)
{
 char character = input.charAt(i);
  if(character == '+') {
                operation = character;
                operationIndex = i;
                break;
            } else if(character == '-') {
                operation = character;
                operationIndex = i;
                break;
            } else if(character == '*') {
                operation = character;
                operationIndex = i;
                break;
            } else if(character == '/') {
                operation = character;
                operationIndex = i;
                break;
            }
        }
 if (operationIndex == -1) {
            System.out.println("Invalid operation.");
            return;
        }
      String firstNumberStr = input.substring(0, operationIndex).trim();
        String secondNumberStr = input.substring(operationIndex + 1).trim();

 double num1 = Double.parseDouble(firstNumberStr);
            double num2 = Double.parseDouble(secondNumberStr);

           
        double result = 0.0;
          switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Unknown operation.");
                    return;
            }

            System.out.println("Result: " + result);
    }
}
}
 
