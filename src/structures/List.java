package structures;

public class List<T, K> {

	private Node<T, K> head = null;
	private Node<T, K> tail = null;

	public void add(T node, K key) {

		if (null == head) {

			head = new Node<T, K>(node, key);
			tail = head;
			head.setRight(tail);
			tail.setRight(head);

		} else {

			tail.setRight(new Node<T, K>(node, key));
			tail = tail.getRight();
			tail.setRight(head);

		}

	}

	public T get(K key) {

		if (null != head && key == head.getKey()) {

			return head.getType();

		} else if (null != head) {

			Node<T, K> temp = head;
			
			while (null != temp.getRight() && key != temp.getKey()){
				
				temp = temp.getRight();
				
			}
			
			if(key == temp.getKey()){
				
				return temp.getType();
				
			} else {
				
				return null;
				
			}
			
		} else {
			
			return null;
			
		}

	}

}
