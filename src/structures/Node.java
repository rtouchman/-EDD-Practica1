package structures;

public class Node<T,K> {
	
	private Node<T, K> right;
	
	private K key = null;
	private T type = null;
	
	public Node(T type, K key){
		this.type = type;
		this.key = key;
	}

	public Node<T, K> getRight() {
		return right;
	}

	public void setRight(Node<T, K> right) {
		this.right = right;
	}

	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
}
