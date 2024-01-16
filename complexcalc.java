import java.util.Scanner;

public class complexcalc {
    public static void main(String[] args){
        //Import Scanner to allow User input Values of their Choice
        Scanner scanner = new Scanner(System.in);

        //Prints code to allow user input values
        System.out.println("Simple Calculator");
        System.out.println("Enter Number :");
        double num1 = scanner.nextDouble();

        //Asks if user wants to input another value
        System.out.println("Do you want to input another value ? : ");
        
        System.out.println("1. No");
        System.out.println("2. Yes");

        System.out.println("Enter your choice :");
        int first_choice = scanner.nextInt();

        switch(first_choice){
            case 1:
                
                System.out.println("Enter Operator");
                System.out.println("1. Square");
                System.out.println("2. Square Root");
                System.out.println("3. Tan" );
                System.out.println("4. Cos" );
                System.out.println("5. Sin" );

                
                int second_choice = scanner.nextInt();

                switch (second_choice) {
                    case 1:
                    System.out.println("Result =" + Math.pow(num1,2));
                        break;
                    case 2:
                    System.out.println("Result =" + Math.sqrt(num1));
                    break;
                    case 3:
                    System.out.println("Result =" + Math.tan(num1));
                    break;
                    case 4:
                    System.out.println("Result =" + Math.cos(num1));
                    break;
                    case 5:
                    System.out.println("Result =" + Math.sin(num1));
                    break;

                
                }
                break;
            case 2:
                System.out.println("Enter Your Second number");
                
                break;

        }
        double num2 = scanner.nextDouble();

        System.out.println("Enter Operator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int Operator_choice = scanner.nextInt();

        switch (Operator_choice) {
            case 1:
                System.out.println("Result =" + (num1 + num2));
                break;
            case 2:  
                System.out.println("Result =" + (num1 - num2));
                break;
            case 3:
                System.out.println("Result =" + (num1 * num2));
                break;
            case 4:
                if (num2 != 0){
                    System.out.println("Result =" + (num1 / num2));
                }else{
                    System.out.println("Error Indivisible By Zero");
                }

        
            default:
            System.out.println("Invalid Choice");
                break;
        }
        
        }
    }

        