package org.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class UniqueArrayList extends ArrayList {
    List arrayList = new ArrayList();

    @Override
    public Object set(int index, Object element) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.equals(element)) {
                System.out.println("object alredy exist");
                return false;
            } else {
                System.out.println("Object set to list");
                return true;
            }
        }
        return super.set(index, element);
    }

    @Override
    public boolean add(Object o) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.equals(o)) {
                System.out.println("object alredy exist");
                return false;
            } else {
                System.out.println("Object add to list");
                return true;
            }
        }
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.equals(element)) {
                System.out.println("object alredy exist");
            } else {
                System.out.println("Object add to list");
            }
        }
        super.add(index, element);
    }
}
