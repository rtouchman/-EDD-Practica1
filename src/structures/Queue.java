package structures;

public class Queue<T, K> extends List<T, K>{
	
	public void enqueue(T node){
		
		if (null == head) {

			head = new Node<T, K>(node, null);
			tail = head;
			head.setRight(tail);
			tail.setRight(head);

		} else {

			tail.setRight(new Node<T, K>(node, null));
			tail = tail.getRight();
			tail.setRight(head);

		}
		
	}
	
	public T dequeue(){
		
		Node<T, K> temp = head, result;
		
		while(tail != temp.getRight()){
			
			temp = temp.getRight();
			
		}
		
		result = tail;
		
		tail = temp;
		tail.setRight(head);
		
		result.setRight(null);
		
		return result.getType();
		
	}

}
