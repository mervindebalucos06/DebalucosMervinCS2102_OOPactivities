import java.util.Scanner;

public class GettingGreater {
  public static void main(String[] args) {
    //getting the input from the user
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Getting the Greater Value");
    //prompt the user to enter the first character and the console will display the first character or index 0 
    System.out.print("Enter first character: ");
    char firstChar = scanner.next().charAt(0);
    
    //prompt the user to enter the first character and the console will display the first character or index 0
    System.out.print("Enter second character: ");
    char secondChar = scanner.next().charAt(0);

    //use Math.max to get the larger value
    char greaterChar = (char) Math.max(firstChar, secondChar);

    System.out.println("-----------------------------------------");
    System.out.println("The character with the greater value is: " + greaterChar);
    System.out.println("-----------------------------------------");

    //display the character and casts it into integer to show their ASCII values
    System.out.println("Showing the ASCII Codes");
    System.out.println(firstChar + " : " + (int) firstChar);
    System.out.println(secondChar + " : " + (int) secondChar);
    //to prevent resource leak
    scanner.close();
  }
}
