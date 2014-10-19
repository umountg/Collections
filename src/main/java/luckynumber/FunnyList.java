package luckynumber;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;


public class FunnyList<E> implements Iterable {
    private transient Object[] storage;

    private void setStorageLocked(boolean storageLocked) {
        this.storageLocked = storageLocked;
    }

    public boolean isStorageLocked() {
        return storageLocked;
    }

    private boolean storageLocked;
    private int lastElementIndex = -1;
    private int firstElementIndex = 0;

    public FunnyList(int storageSize) {
        storage = new Object[storageSize];
    }

    public FunnyList() {
        storage = new Object[5];

    }

    private int getNewElementIndex() {
        lastElementIndex = lastElementIndex + 1;
        if (lastElementIndex >= storage.length) {
            storage = Arrays.copyOf(storage, storage.length + 5);
        }

        return lastElementIndex;
    }


    private E getByIndex(int index) {
        if (index >= firstElementIndex && index <= lastElementIndex) {
            return (E) storage[index];
        } else throw new IndexOutOfBoundsException();
    }

    void add(E obj) {
        if (!isStorageLocked()) {
            int newEledment = getNewElementIndex();
            storage[newEledment] = obj;
        } else System.out.println("Storege locked. Element not added!");
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new FunnyIterator();
    }

    private boolean isEmpty() {
        return lastElementIndex == -1;
    }

    private E getRandomObject() {
        setStorageLocked(true);
        Random rand = new Random();
        int min = firstElementIndex;
        int max = lastElementIndex;
        int randIndex = rand.nextInt(max - min + 1) + min;
        E randomObject = getByIndex(randIndex);
        storage = ArrayUtils.removeElement(storage, getByIndex(randIndex));
        lastElementIndex--;

        return randomObject;
    }

    private class FunnyIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return !isEmpty();
        }

        @Override
        public Object next() {
            return getRandomObject();
        }

        @Override
        public void remove() {
            return;
        }
    }
}
