import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    ArrayList mainArr = new ArrayList<Integer>();
    //Gets number of trials:
    int numTrials = Integer.parseInt(args[0]);
    //Variable that holds the current size of the array:
    int arrSize = 20;
    //Main loop
    for (int i = 0; i<numTrials; i++) {
      for(int j=0; j<5; j++){
        mainArr = Sorts.populate(arrSize, 0, arrSize*2);
        Sorts.bubbleSort(mainArr);
        Sorts.selectionSort(mainArr);
        Sorts.insertionSort(mainArr);
        //for each successive trial, the array size will increase by 20
      }
      arrSize += 20;
    }
  }
}
