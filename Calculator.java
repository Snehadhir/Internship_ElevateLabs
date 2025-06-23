import java.util.*;

class Calculations{
    public static int Addition(int[] numbers){
        int sum = 0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=numbers[i];
        }
        return sum;
    }
    public static int Subtraction(int[] numbers ){
        int result =numbers[0];
        for(int i = 1;i<numbers.length;i++){
            result -= numbers[i];
        }
        return result;
    }
    public static int Multiplication(int[] numbers){
        int product = 1;
        for(int i=0;i<numbers.length;i++){
            product*=numbers[i];
        }        
        return product;
    }    
    public static double Division(double[] numbers){
        double result  = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]==0){
                System.out.println("Cannot be divided by 0.");
                return 0;
            }
            result/=numbers[i];
        }
        return result;
    }
    public static double PowerOf(int a,int b){
        double result = 1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    public static double SquareRoot(double number){
        if(number<0){
            System.out.println("Cannot find the Square Root of the number");
            return -1;
        }
        double guess = number/2.0;
        for(int i=0;i<20;i++){
            guess = (guess+number/guess)/2.0;
        }
        return guess;
    }
}
    public class Calculator{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int choice;
            while(true){
                System.out.println("\n Enter your choice: ");
                System.out.println("1) Addition ");
                System.out.println("2) Subtraction ");
                System.out.println("3) Multiplication ");
                System.out.println("4) Division ");
                System.out.println("5) Power(Two Numbers) ");
                System.out.println("6) Square Root ");
                System.out.println("7) Exit ");

                choice = sc.nextInt();
                if(choice == 7){
                    System.out.println("EXIT!!");
                    break;
                }
                switch(choice){
                    case 1:
                        System.out.print("Enter the amount of numbers you want to add: ");
                        int count = sc.nextInt();
                        int[] AddNum = new int[count];
                        for(int i=0;i<count;i++){
                            System.out.print("Enter Numbers: "+ (i+1) + ": ");
                            AddNum[i] = sc.nextInt();
                        }
                        System.out.println("Result: " +Calculations.Addition(AddNum));
                        break;
                    case 2: 
                        System.out.print("Enter the amount of numbers you want to subtract: ");
                        int countsub = sc.nextInt();
                        int [] SubNum = new int[countsub];
                        for(int i=0;i<countsub;i++){
                            System.out.print("Enter numbers: "+(i+1)+ ":");
                            SubNum[i] = sc.nextInt();
                        }
                        System.out.println("Result: "+Calculations.Subtraction(SubNum));
                        break;
                    case 3:
                        System.out.print("Enter the amount of numbers you want to multiply: ");
                        int countmul = sc.nextInt();
                        int[] mulnum = new int[countmul];
                        for(int i=0;i<countmul;i++){
                            System.out.println("Enter numbers: "+(i+1)+ ":");
                            mulnum[i] = sc.nextInt();
                        }
                        System.out.println("Result: "+Calculations.Multiplication(mulnum));
                        break;
                    case 4: 
                        System.out.print("Enter the amount of numbers you want to divide : ");
                        int countdiv = sc.nextInt();
                        double[] divnum = new double[countdiv];
                        for(int i=0;i<countdiv;i++){
                            System.out.print("Enter numbers: "+(i+1)+ ":");
                            divnum[i] = sc.nextDouble();
                        }
                        System.out.println("Result: "+Calculations.Division(divnum));
                        break;
                    case 5:
                        System.out.print("Enter the base number: ");
                        int base = sc.nextInt();
                        System.out.print("Enter the exponent number: ");
                        int exponent = sc.nextInt();
                        System.out.println("Result: "+Calculations.PowerOf(base, exponent));
                        break;
                    case 6:
                        System.out.print("Enter a number to find Square root: ");
                        double numbers = sc.nextInt();
                        System.out.println("Square Root is: " +Calculations.SquareRoot(numbers));
                        break;
                    default: 
                        System.out.println("Invalid Choice." );
                        break;
                }
            }
            sc.close();
        }
    }

