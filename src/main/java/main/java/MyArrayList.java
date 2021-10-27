package main.java;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.apache.commons.lang3.ArrayUtils;

public class MyArrayList<T> implements List<Object> {

    public Object[] myList;

    public MyArrayList(int initialCapacity) {
        this.myList = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return myList.length;
    }

    @Override
    public boolean isEmpty() {
        return myList.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object o1 : myList) {
            if (o == o1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override
    public void forEach(Consumer<? super Object> action) {
        for (Object o : myList) {
            action.accept(o);
        }
    }

    @Override
    public Object[] toArray() {
        int length = myList.length;
        var newArr = myList;
        arraycopy(myList, 0, newArr, 0, length);
        return newArr;
    }

    @Override
    public boolean remove(Object o) {
        myList = ArrayUtils.removeElement(myList, o);
        return true;
    }


    @Override
    public boolean add(Object o) {
        myList = ArrayUtils.add(myList, o);
        out.println(Arrays.toString(myList));
        return true;
    }

    @Override
    public boolean addAll(Collection<?> collection) {
        for (Object o : collection) {
            add(o);
        }
        return false;
    }

    @Override
    public boolean addAll(int startIndex, Collection<?> collection) {
        if (startIndex < 0 || startIndex > myList.length) {
            throw new IndexOutOfBoundsException();
        }

        int counter = 0;
        for (Object o : collection) {
            add(startIndex + counter, o);
            counter++;
        }

        return true;
    }

    //Don't do
    @Override
    public void replaceAll(UnaryOperator<Object> operator) {
        List.super.replaceAll(operator);
    }

    //Don't do
    @Override
    public void sort(Comparator<? super Object> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {
        for (Object o : myList) {
            if (contains(o)) {
                remove(o);
                out.println(Arrays.toString(myList));
            }
        }
    }

    @Override
    public Object get(int i) {
        return myList[i];
    }

    @Override
    public Object remove(int i) {
        for (Object o : myList) {
            if (indexOf(o) == i) {
                remove(o);
            }
        }
        return get(i);
    }

    @Override
    public Object set(int i, Object o) {
        for (Object o1 : myList) {
            if (indexOf(o1) == i) {
                remove(o1);
                add(o);
            }
        }
        return myList[i];
    }

    @Override
    public void add(int i, Object o) {
        myList = ArrayUtils.insert(i, myList, o);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    //Don't do
    @Override
    public ListIterator<Object> listIterator() {
        return null;
    }

    //Don't do
    @Override
    public ListIterator<Object> listIterator(int i) {
        return null;
    }


    @Override
    public List<Object> subList(int i, int i1) {
        return null;
    }


    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    //Don't do
    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myList=" + Arrays.toString(myList) +
                '}';
    }
}

