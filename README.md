# sort-o_Walrus
**Walrus** (Humans: Daniel Jung, Joshua Yagupsky, Ethan Lam; Ducks: Ralph, Quacker, Carl)

**Song of the Week** [Kathy's Waltz] (https://www.youtube.com/watch?v=z8GLQycLjDg)

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

# selectionSort
**Best Case**

Every case for selection sort will take the same amount of time.

Reason: Regardless of the positioning of the elements in the list, for every pass it compares all of the elements of the list and conducts one swap.

**Worst Case**

Every case for selection sort will take the same amount of time.

Reason: Regardless of the positioning of the elements in the list, for every pass it compares all of the elements of the list and conducts one swap.

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
