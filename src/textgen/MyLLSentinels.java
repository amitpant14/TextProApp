package textgen;

import java.util.AbstractList;

public class MyLLSentinels<E> extends AbstractList<E>{
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLLSentinels() {
		// TODO: Implement this method
		size = 0;
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		if (element == null) {
			throw new NullPointerException();
		}
		LLNode<E> newNode = new LLNode<E>(element);
//		System.out.println(newNode.data);
		if (size == 0) {
			//with sentinel nodes
			head.next = newNode;
			newNode.prev = head;
			newNode.next = tail;
			tail.prev = newNode;
			size+=1;
		}
		else {
			//with sentinel nodes
			LLNode<E> lastNode = tail.prev;
			lastNode.next = newNode;
			newNode.prev = lastNode;
			newNode.next = tail;
			tail.prev = newNode;
			size+=1;
		}
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		E value;
//		System.out.println("size = "+Integer.toString(size));
		// TODO: Implement this method.
		if (index>size-1 || index<0) {
//			System.out.println("wrong index");
//			System.out.println(index);
			throw new IndexOutOfBoundsException();
		}
		else {
			//with sentinels
//			System.out.println("before loop");
			LLNode<E> currNode = new LLNode<E>(null);
			LLNode<E> prevNode = head;
			for (int i = 0; i<=index; i++) {
//				System.out.println("inside loop");
				currNode = prevNode.next;
				prevNode = currNode;
//				System.out.println(currNode.data);
			}
			value = currNode.data;
//			System.out.println("Final data = ");
//			System.out.println(value);
		}
		return value;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		if (element == null) {
			throw new NullPointerException();
		}
		LLNode<E> newNode = new LLNode<E>(element);
		if (index>size-1 || index<0) {
			if (size == 0 && index == 0) {
//				with sentinel nodes
				head.next = newNode;
				newNode.prev = head;
				newNode.next = tail;
				tail.prev = newNode;
				size+=1;
			}
			else {
				throw new IndexOutOfBoundsException();
			}
		}
//		System.out.println(newNode.data);
		else {
			if (index == 0) {
				//with sentinel nodes
				LLNode<E> first = head.next;
				head.next = newNode;
				newNode.prev = head;
				newNode.next = first;
				size+=1;
			}
			else {
				//with sentinel nodes
				LLNode<E> befIndex = head;
				LLNode<E> atIndex = head.next;
				for (int i = 0; i<index; i++) {
					befIndex = befIndex.next;
					atIndex = atIndex.next;
				}
				befIndex.next = newNode;
				newNode.prev = befIndex;
				newNode.next = atIndex;
				atIndex.prev = newNode;
				size+=1;
			}
		}
		
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		E toRemove;
		if (index>size-1 || index<0) {
			throw new IndexOutOfBoundsException();
		}
//		System.out.println(newNode.data);
		else {
			if (index == 0) {
				//with sentinel nodes
				toRemove = head.next.data;
				head = head.next;
	//			System.out.println("first node added and contains ");
	//			System.out.println(head.next.data);
				size-=1;
			}
			else {
				//with sentinel nodes
				LLNode<E> befIndex = head;
				LLNode<E> atIndex = head.next;
//				System.out.println("inserting at index = "+ Integer.toString(index));
				for(int i = 0; i<index; i++) {
					befIndex = befIndex.next;
					atIndex = atIndex.next;
				}
//				System.out.println("before given index = " + befIndex.data);
				toRemove = atIndex.data;
				befIndex.next = atIndex.next;
//				System.out.println("at given index = " + atIndex.data);
				atIndex.next.prev = befIndex;
				size-=1;
			}
		}
		return toRemove;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if (element == null) {
			throw new NullPointerException();
		}
		E old;
		if (index>size-1 || index<0) {
			throw new IndexOutOfBoundsException();
		}
//		System.out.println(newNode.data);
		else {
			if (index == 0) {
				//with sentinel nodes
				old = head.next.data;
				head.next.data = element;
			}
			else {
				//with sentinel nodes
				LLNode<E> befIndex = head;
				LLNode<E> atIndex = head.next;
				for (int i = 0; i<index; i++) {
					befIndex = befIndex.next;
					atIndex = atIndex.next;
				}
				old = atIndex.data;
				atIndex.data = element;
			}
		}
		return old;
	}   
}


