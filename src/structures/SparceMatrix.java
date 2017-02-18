package structures;

public class SparceMatrix<T, K> {

	private MatrixNode<T, K> index;
	int n, width, height;

	public SparceMatrix() {

		index = new MatrixNode<T, K>(null, 0, 0);
		n = 0;
		width = 0;
		height = 0;

	}

	public MatrixNode<T, K> getIndex() {
		return index;
	}

	public void setIndex(MatrixNode<T, K> index) {
		this.index = index;
	}

	public int getN() {
		return n;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void addNode(T node, int x, int y) {

		MatrixNode<T, K> xBuffer = getRight(index, x), yBuffer = getDown(index, y), aux = null;

		xBuffer = getDown(xBuffer, y);
		yBuffer = getRight(yBuffer, x);

		if (xBuffer != yBuffer) {

			if (null != yBuffer.getRight()) {

				aux = yBuffer.getRight();

			}

			if (null != yBuffer.getLeft()) {

				yBuffer = yBuffer.getLeft();

			}

			yBuffer.setRight(xBuffer);
			xBuffer.setLeft(yBuffer);

			if (null != aux) {

				xBuffer.setRight(aux);
				xBuffer.getRight().setLeft(xBuffer);

			}

		}

		xBuffer.setType(node);
		
		if (null != node) {
			
			n++;
			
		}
		

	}

	// Devuelve un nodo, en caso de que no exista el nodo lo inserta
	// La posicion en Y del nodo insertado es la misma que el nodo que
	// recibe como parametro
	private MatrixNode<T, K> getRight(MatrixNode<T, K> node, int x) {

		if (null == node) {

			return null;

		}

		if (node.getX() == x) {

			return node;

		}

		while (null != node.getRight() && node.getRight().getX() < x) {

			node = node.getRight();

		}

		if (null == node.getRight()) {

			node.setRight(new MatrixNode<T, K>(null, x, node.getY()));
			node.getRight().setLeft(node);
			node = node.getRight();
			width++;

		} else if (node.getRight().getX() == x) {

			node = node.getRight();

		} else if (node.getRight().getX() > x) {

			MatrixNode<T, K> temp = node.getRight();

			node.setRight(new MatrixNode<T, K>(x, node.getY()));
			node.getRight().setLeft(node);
			node = node.getRight();
			temp.setLeft(node);
			node.setRight(temp);
			width++;

		} else {

			return null;

		}

		return node;

	}

	// Devuelve un nodo, en caso de que no exista el nodo lo inserta
	// La posicion en X del nodo insertado es la misma que el nodo que
	// recibe como parametro
	private MatrixNode<T, K> getDown(MatrixNode<T, K> node, int y) {

		if (null == node) {

			return null;

		}

		if (node.getY() == y) {

			return node;

		}

		while (null != node.getDown() && node.getDown().getY() < y) {

			node = node.getDown();

		}

		if (null == node.getDown()) {

			node.setDown(new MatrixNode<T, K>(node.getX(), y));
			node.getDown().setUp(node);
			node = node.getDown();
			height++;

		} else if (node.getDown().getY() == y) {

			node = node.getDown();

		} else if (node.getDown().getY() > y) {

			MatrixNode<T, K> temp = node.getDown();

			node.setDown(new MatrixNode<T, K>(node.getX(), y));
			node.getDown().setUp(node);
			node = node.getDown();
			temp.setUp(node);
			node.setDown(temp);
			height++;

		} else {

			return null;

		}

		return node;

	}
	
//	public Node getNode(int x, int y){
//		
//		Node result = null;
//		
//		
//		
//		return result;
//		
//	}

}

