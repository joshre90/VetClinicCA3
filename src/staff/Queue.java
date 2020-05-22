package staff;

import animal.PetAnimals;

/**
 * @author Amilcar Aponte - Collections Class - Week 9 March - 15 March
 */

public class Queue {

	private PetAnimals first;
	private PetAnimals last;
	private int size;

	public Queue() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public void add(PetAnimals animal) {
		if (size == 0) {
			this.first = animal;
			this.last = animal;
			size++;
		} else {
			this.last.setNext(animal);
			this.last = animal;
			size++;
		}
	}

	public boolean remove() {
		if (size == 0) {
			return false;
		} else if (size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		} else {
			this.first = this.first.getNext();
			size--;
			return true;
		}
	}

	@Override
	public String toString() {
		String toReturn = "-\n";
		PetAnimals current = this.first;
		while (current != null) {
			toReturn += current.toString() + "\n-\n";
			current = current.getNext();
		}
		return toReturn;

	}

	public PetAnimals getFirst() {
		return first;
	}

	public void setFirst(PetAnimals first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

}