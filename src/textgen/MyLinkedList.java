package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
		size = 0;
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
			//without sentinel nodes
			head = newNode;
			tail = newNode;
			head.next = null;
			tail.prev = null;
////			System.out.println("first node added and contains ");
////			System.out.println(head.next.data);
			size+=1;
		}
		else {
			//without sentinel nodes
			LLNode<E> lastNode = tail;
//			LLNode<E> headNode = head;
			lastNode.next = newNode;
			newNode.prev = lastNode;
			tail = newNode;
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
			//without sentinels
			LLNode<E> currNode = head;
//			LLNode<E> prevNode = head;
			for (int i = 0; i<index; i++) {
//				System.out.println("inside loop");
				currNode = currNode.next;
//				currNode = prevNode.next;
//				prevNode = currNode;
//				System.out.println(currNode.data);
			}
			value = currNode.data;
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
				//without sentinel nodes
				head = newNode;
				tail = newNode;
				head.next = null;
				tail.prev = null;
	//			System.out.println("first node added and contains ");
	//			System.out.println(head.next.data);
				size+=1;
			}
			else {
				throw new IndexOutOfBoundsException();
			}
		}
//		System.out.println(newNode.data);
		else {
			if (index == 0) {
				//without sentinel nodes
				LLNode<E> first = head;
				head = newNode;
				head.next = first;
	//			System.out.println("first node added and contains ");
	//			System.out.println(head.next.data);
				size+=1;
			}
			else {
				//without sentinel nodes
				LLNode<E> befIndex = head.prev;
				LLNode<E> atIndex = head;
//				System.out.println("inserting at index = "+ Integer.toString(index));
				for(int i = 0; i<index; i++) {
					befIndex = atIndex;
					atIndex = atIndex.next;
				}
//				System.out.println("before given index = " + befIndex.data);
				befIndex.next = newNode;
//				System.out.println("at given index = " + atIndex.data);
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
				//without sentinel nodes
				toRemove = head.data;
				LLNode<E> second = head.next;
				head = second;
	//			System.out.println("first node added and contains ");
	//			System.out.println(head.next.data);
				size-=1;
			}
			else {
				//without sentinel nodes
				LLNode<E> befIndex = head.prev;
				LLNode<E> atIndex = head;
//				System.out.println("inserting at index = "+ Integer.toString(index));
				for(int i = 0; i<index; i++) {
					befIndex = atIndex;
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
				//without sentinel nodes
				old = head.data;
				head.data = element;
	//			System.out.println("first node added and contains ");
	//			System.out.println(head.next.data);
			}
			else {
				//without sentinel nodes
				LLNode<E> befIndex = head.prev;
				LLNode<E> atIndex = head;
//				System.out.println("inserting at index = "+ Integer.toString(index));
				for(int i = 0; i<index; i++) {
					befIndex = atIndex;
					atIndex = atIndex.next;
				}
				old = atIndex.data;
				atIndex.data = element;
			}
		}
		return old;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
