import static java.lang.System.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.apache.commons.lang3.ArrayUtils;

public class MyArrayList<T> implements List<T> {

    public Object[] myList;

    public MyArrayList() {
        this.myList = new Object[10];
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
    public Iterator iterator() {
        return listIterator();
    }

    @Override
    public void forEach(Consumer action) {
        for (int i = 0; i < myList.length; i++) {

        }

    }

    //ToDo
    @Override
    public Object[] toArray() {
        return myList.clone();
    }

    @Override
    public boolean remove(Object o) {
        return myList == ArrayUtils.removeElement(myList, o);

    }

    @Override
    public boolean add(Object o) {
        int length = myList.length;
        var newArr = new Object[length + 1];
        arraycopy(myList, 0, newArr, 0, length);
        for (Object o1 : newArr) {
            return o == o1;
        }
        return true;
    }


    @Override
    public boolean addAll(Collection collection) {
        for (Object o : collection) {
            add(o);
        }
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    //Don't do
    @Override
    public void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    //Don't do
    @Override
    public void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

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
    public ListIterator listIterator() {
        return null;
    }

    //Don't do
    @Override
    public ListIterator listIterator(int i) {
        return null;
    }


    @Override
    public List subList(int i, int i1) {
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
}

