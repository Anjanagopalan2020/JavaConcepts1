package Concepts;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.add(1);
		p.offer(2);
		p.add(3);
		p.offer(4);
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p);
	}

}
