
public interface HeapSortMethods {

	//method returns a sorted array, and will call the methods below somewhere in the method
	public int[] heapSort();
	
	//constructs a max heap from the unsorted array
	public void buildHeap();
	
	//will heapify down an element (current) within the bounds of the array (bound)
	public void heapifyDown(int bound, int current);
	
	//swaps two elements with index i and index j in the array
	public void swap(int i, int j);
}
