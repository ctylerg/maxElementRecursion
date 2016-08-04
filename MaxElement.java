import java.util.Scanner;

public class MaxElement{
  public static void main(String[] args){
    int maxNum;
    int arrayNum;


    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many numbers would you like to enter into an array?");
    arrayNum = keyboard.nextInt();
    //create new array
    int a[] = new int[arrayNum];
    //user enters numbers for array
    System.out.println("Please enter your " + arrayNum + " numbers now.");
    for(int i = 0; i < a.length; i++ ){
      a[i] = keyboard.nextInt();
    }

    //search for maxNum
    maxNum = findMax(a, 0, a.length -1);
    //display the result
    System.out.println("The max number was " + maxNum + ".");
  }
    public static int findMax(int[] a, int first, int last){
      int max = 0;
      if(first == last){
        return a[first];
      } else if(a[first] < a[last]){
        return findMax(a, first + 1, last);
      } else{
        return findMax(a, first, last -1);
      }
    }
}
