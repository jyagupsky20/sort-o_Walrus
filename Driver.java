import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    //Test code to make sure our sorting methods work
    ArrayList bob = Sorts.populate(50, 1, 100);
    System.out.println("Bob the ArrayList: " + bob);
    System.out.println("Sorted versions: ");
    System.out.println(Sorts.bubbleSort(bob));
    System.out.println(Sorts.insertionSort(bob));
    System.out.println(Sorts.selectionSort(bob));
  }
}
