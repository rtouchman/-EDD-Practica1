package structures;

public class MatrixNode<T, K> extends Node<T, K> {

	private MatrixNode<T, K> right;
	private MatrixNode<T, K> left;
	private MatrixNode<T, K> up;
	private MatrixNode<T, K> down;
	private int x, y;
	
	public MatrixNode(int x, int y) {
		super(null, null);
		this.left = null;
		this.up = null;
		this.down = null;
		this.x = x;
		this.y = y;
	}
	
	public MatrixNode(T type, int x, int y) {
		super(type, null);
		this.left = null;
		this.up = null;
		this.down = null;
		this.x = x;
		this.y = y;
	}
	
	public MatrixNode<T, K> getRight() {
		return right;
	}



	public void setRight(MatrixNode<T, K> right) {
		this.right = right;
	}



	public MatrixNode<T, K> getLeft() {
		return left;
	}



	public void setLeft(MatrixNode<T, K> left) {
		this.left = left;
	}



	public MatrixNode<T, K> getUp() {
		return up;
	}



	public void setUp(MatrixNode<T, K> up) {
		this.up = up;
	}



	public MatrixNode<T, K> getDown() {
		return down;
	}



	public void setDown(MatrixNode<T, K> down) {
		this.down = down;
	}



	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}
