import java.util.Scanner;
public class GetArrayMean {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = input.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter number: ");
      arr[i] = input.nextInt();
    }

    double mean = getArrayMean(arr);
    System.out.printf("Mean of array is: %.2f%n ", mean);
    
    input.close();
  }
  
  public static double getArrayMean(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return (double) sum / arr.length;
  }
}
