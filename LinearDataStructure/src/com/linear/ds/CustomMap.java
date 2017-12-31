package com.linear.ds;

import java.util.ArrayList;

class HashNode<K, V> {
	K key;
	V value;
	HashNode<K, V> next=null;

	public HashNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

public class CustomMap<K, V> {

	private ArrayList<HashNode<K, V>> bucketArray;
	private int capacity;
	private int size;

	public CustomMap() {
		this(10);
	}

	public CustomMap(int capacity) {
		this.bucketArray = new ArrayList<HashNode<K, V>>(capacity);
		this.capacity = capacity;
		this.size = 0;

		// initializing with null all the bucket
		for (int i = 0; i < capacity; i++) {
			bucketArray.add(null);
		}

	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getIndex(K key) {

		// Hash code
		int hashCode = key.hashCode();

		// Compressor.
		int index = hashCode % capacity;
		return index;
	}

	public V get(K key) {

		int index = getIndex(key);
		HashNode<K, V> head = bucketArray.get(index);

		while (head != null) {

			// We are comparing key which will be unique in whole map

			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}

		return null;
	}

	public void put(K key, V value) {

		int index = getIndex(key);
		HashNode<K, V> head = bucketArray.get(index);
		HashNode<K, V> node = new HashNode<K, V>(key, value);
		// update value if key already exists
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		if (head == null) {
			bucketArray.set(index, node);
		}

		// if some other node is available at the same index

		head = bucketArray.get(index);
		while (head.next != null) {
			head = head.next;
		}

		head.next = node;
		size++;

		//making capacity of hashmap double if load factor reach to 5
		if ((1.0 * size) / capacity > 5) {
			size = 0;
			ArrayList<HashNode<K, V>> temp = bucketArray;
			capacity *= 2;
			bucketArray = new ArrayList<HashNode<K, V>>(capacity);

			for (int i = 0; i < capacity; i++) {
				bucketArray.add(null);
			}

			for (HashNode<K, V> hashNode : temp) {
				while (hashNode != null) {
					put(hashNode.key, hashNode.value);
					hashNode = hashNode.next;
				}
			}

		}

	}
	
	public HashNode<K,V> delete(K key) {
		int index = getIndex(key);
		HashNode<K,V> head=bucketArray.get(index);
		
		if(head==null) {
			return null;
		}else {
			
			if(head.key.equals(key)) {
				bucketArray.set(index, null);
				size--;
				return head;
			}else {
				while(head!=null) {
					if(head.next.key.equals(key)) {
						HashNode<K,V> temp=head.next;
						head.next=head.next.next;
						size--;
						return temp;
					}
				}
			}
		}
		
		return null;
	}

}
