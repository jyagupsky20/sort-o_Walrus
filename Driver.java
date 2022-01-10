import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    //IMPORTANT: Format for printing is SortType, size, passes, comparisons, swaps
    ArrayList mainArr = new ArrayList<Integer>();
    //Gets number of trials:
    int numTrials = Integer.parseInt(args[0]);
    //Variable that holds the current size of the array:
    int arrSize = 20;
    //Driver modes: 0: average case, 1: best case, 2: hypothetical worst case
    int mode = Integer.parseInt(args[1]);
    //Randomized data mode:
    if (mode == 0){
      for (int i = 0; i<numTrials; i++) {
        for(int j=0; j<5; j++){
          mainArr = Sorts.populate(arrSize, 0, arrSize*2);
          Sorts.bubbleSort(mainArr);
          Sorts.selectionSort(mainArr);
          Sorts.insertionSort(mainArr);
        }
        arrSize += 20;
      }
    }
    //Best case data mode:
    else if (mode == 1){
      for (int i = 0; i<numTrials; i++) {
        for(int j=0; j<5; j++){
          mainArr = Sorts.populateSorted(arrSize, 0, arrSize*2);
          Sorts.bubbleSort(mainArr);
          Sorts.selectionSort(mainArr);
          Sorts.insertionSort(mainArr);
        }
        arrSize += 20;
      }
    }
    //Worst case data mode
    else{
    	for (int i = 0; i<numTrials; i++) {
        for(int j=0; j<5; j++){
          mainArr = Sorts.populateReversed(arrSize);
          Sorts.bubbleSort(mainArr);
          Sorts.selectionSort(mainArr);
          Sorts.insertionSort(mainArr);
        }
        arrSize += 20;
      }
    }
  }
}
