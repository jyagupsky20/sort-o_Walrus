import java.util.ArrayList;

public class Sorts
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }
  public static ArrayList populateSorted(int size, int lo, int hi) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
    size--;
    while( size > 0 ) {
      //previous element + rand int on interval [lo,hi]
      retAL.add(retAL.get(retAL.size()-1)+ lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }
public static ArrayList populateReversed(int size){
	ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //rand int on interval [lo,hi]
      retAL.add(size);
      size--;
    }
    return retAL;
}
  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    Comparable temp;
    int passes = 0;
    int comps = 0;
    int swaps = 0;
    passes = data.size()-1;
    //The outer loop is for completing n-1 passes
    for(int p = 0; p < passes; p++){
      //Here we traverse the array, but we speed things up by not having to modify elements we know are sorted.
      for (int i = data.size()-1; i > p; i--) {
        comps++;
        if(data.get(i).compareTo(data.get(i-1)) < 0){
          //Swap!
          temp = data.remove(i-1);
          data.add(i,temp);
          swaps++;
        }
      }
    }
    System.out.println(0 + "," + data.size() + "," + passes + "," + comps + "," + swaps);
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    bubbleSortV( data );

    return data;
  }


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = 0;
    Comparable temp;
    int passes = 0;
    int comps = 0;
    int swaps = 0;
    passes = data.size()-1;
    for( int pass = passes; pass > 0; pass--) {
      /*System.out.println( "\nbegin pass " + (data.size()-pass) );//diag*/
      for( int i = 0; i <= pass; i++ ) {
        comps++;
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
        	maxPos = i;
        }

        /*System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag*/
      }
      temp = data.remove(maxPos);
      data.add(pass, temp);
      /*System.out.println( "after swap: " +  data );//diag*/
      maxPos = 0;
      swaps++;
    }
    System.out.println(1 + "," + data.size() + "," + passes + "," + comps + "," + swaps);
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort

  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    Comparable temp;
    int passes = 0;
    int comps = 0;
    int swaps = 0;
    passes = data.size()-1;
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for(int prev = partition-1; prev >= 0; prev--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        comps++;
        if (data.get(prev).compareTo(data.get(prev+1)) > 0) {
          temp = data.remove(prev+1);
          data.add(prev,temp);
          swaps++;
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

        }
        else
          break;
      }
    }
    System.out.println(2 + "," + data.size() + "," + passes + "," + comps + "," + swaps);
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

}
