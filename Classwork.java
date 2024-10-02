import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String itemName = sc.nextLine();
    System.out.println("How many are you buying?");
    int numItems = sc.nextInt();
    System.out.println("How much does each item weigh?");
    double itemWeight = sc.nextDouble();
    System.out.println(numItems + " " + itemName + " at " + itemWeight + " pounds each will weigh " + (numItems*itemWeight) + " pounds total.");
    
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    System.out.println("(\\(\\\n( - -)\n((\')(\')");
  }
}
