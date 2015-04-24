import java.util.Arrays;

// Generic implementation of BinaryHeap that can be constructed with any type T.
// Doesn't matter what type T is. All that matters is T has a compareTo method
// -- i.e., T implements Comparable. See HuffmanTree.

public class BinaryHeap<T extends Comparable<T>> 
{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;
    
    
    @SuppressWarnings("unchecked")
	public BinaryHeap () {
        // Java doesn't allow construction of arrays of placeholder data types 
        array = (T[]) new Comparable[DEFAULT_CAPACITY];  
        size = 0;
    }

	
    public void add(T value) {
		array[0] = value; // stub - remove me
	}

	public T remove() {
		return null; // stub - remove me
	}
}



