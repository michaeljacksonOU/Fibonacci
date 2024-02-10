import java.util.Scanner;

public class App {
   public static void computeFibonacci(int fibNum1, int fibNum2, int runCnt) {
      System.out.println((fibNum1));

      if (runCnt <= 0) { 
      }
      else {
         computeFibonacci(fibNum2, fibNum1 + fibNum2, runCnt-1);
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int runFor;    
      System.out.print("How many steps would you like? ");
      runFor = scnr.nextInt();
      computeFibonacci(0, 1, runFor);

      int firstArg;
      if (args.length > 0) {
         try {
            firstArg = Integer.parseInt(args[0]);
         } catch (NumberFormatException e) {
            System.err.println("Argument" + args[0] + " must be an integer.");
            System.exit(1);
         }
      }
         }
      }