# sort-o_Walrus
**Walrus** (Humans: Daniel Jung, Joshua Yagupsky, Ethan Lam; Ducks: Ralph, Quacker, Carl)

**Song of the Week** [Kathy's Waltz, by Dave Brubeck](https://www.youtube.com/watch?v=z8GLQycLjDg)

# bubbleSort
**Best Case**

The best case scenario is a sorted list.
(smallest element, 2nd smallest element... ,largest element)

*Ex. (1,2,3,4)*

Reason: The list makes no swaps and has to traverse the list once.

**Worst Case**

The worst case scenario is a list in reverse order.
(largest element, second largest element... ,smallest element)

*Ex. (4,3,2,1)*

Reason: The list must swap every bubble. The list must make (size) passes because every pass will only put 1 element in the correct place.

Big-O Classification: Bubble sort is quadratic, or O(n^2). For an array size 100 in the worst case scenario, the last element will be compared and swapped 99 (or size-1) times. The second to last element will be compared and swapped 98 times, and so forth. There will be 99 (or size-1) passes. So the number of comparison and swaps that will need to be made is roughly quadratic.

In the best case, there will be 99 comparisons per pass and no swaps. There will be 99 passes.

# selectionSort
**Best Case**

Every case for selection sort will take the same amount of time.

Reason: Regardless of the positioning of the elements in the list, for every pass it compares all of the elements of the list and conducts one swap.

**Worst Case**

Every case for selection sort will take the same amount of time.

Reason: Regardless of the positioning of the elements in the list, for every pass it compares all of the elements of the list and conducts one swap.

Big-O Classification: Selection sort is quadratic, or O(n^2). For an array size 100, selection sort needs to search through 100 items 100 times, or 100^2 searches.

The same applies for the best case scenario.

# insertionSort
**Best Case**

The best case scenario is a sorted list.
(smallest element, 2nd smallest element... ,largest element)

*Ex. (1,2,3,4)*

Reason: The list makes no swaps.

**Worst Case**

The worst case scenario is a list in reverse order.
(largest element, second largest element... ,smallest element)

*Ex. (4,3,2,1)*

Reason: Every number needs to be walked "as much as possible." For instance, 1 needs to be swapped 4 times to reach its spot, 2 needs to swap 3 times, etc. Since swapping is intensive on computer resources, swapping as many times as possible is the worst case scenario.

Big-O Classification: Selection sort is quadratic, or O(n^2). For an array size 100 in the worst case scenario, the first element will be compared and swapped 1 time. The second element will be compared and swapped 2 times, and so forth, with the final element being compared and swapped 99 (or size-1) times. There will be 99 (or size-1) passes. So the number of comparison and swaps that will need to be made is roughly quadratic.

In the best case, there will be 99 comparisons per pass and no swaps. There will be 99 passes.
