package diagram.editor.sirius.util.datastructures;

/**
 * 
 * Simple Utility class
 * 
 */

public class Tuple<T, V> {
	private final T first;
	private final V second;

	public Tuple(T first, V second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return this.first.toString() + ", " + this.second.toString();
	}
}