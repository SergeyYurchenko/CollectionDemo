package org.collectionDemo;


import java.util.*;

public class ListDemo {
    private int randomLengthList;
    private int lengthList = 100;
    private int minNumber = 100;
    private int maxNumber = 200;
    List list;
    List thirdList;
    List listNumber_;
    //List listOddNumber;


    public List generateRandomList() {
        list = new ArrayList();
        randomLengthList = ((int) ((Math.random() * ((maxNumber - minNumber) + 1)) + minNumber));
        for (int i = 0; i < randomLengthList; i++) {
            int randomNumber = ((int) ((Math.random() * ((maxNumber - minNumber) + 1)) + minNumber));
            list.add(randomNumber);
        }
        System.out.println(" length list =" + randomLengthList);
        return this.list = list;
    }

    public List multiplyList(List firstList, List secondList) {
        thirdList = new ArrayList();
        firstList = generateRandomList();
        secondList = generateRandomList();
        for (int i = 0; i < firstList.size(); i++) {
            if (i < secondList.size()) {
                double a = (int) firstList.get(i) * (int) secondList.get(i);
                thirdList.add(a);
                System.out.print("Our first list: " + firstList.get(i) + " ");
                System.out.print("Our second list: " + secondList.get(i) + " ");
                System.out.println("Our third list: " + thirdList.get(i));
            } else {
                thirdList.add(firstList.get(i));
                System.out.print("Our first list: " + firstList.get(i) + " ");
                System.out.print("Our second list: ");
                System.out.println("Our third list: " + thirdList.get(i));
            }

        }
      return thirdList;
    }

    private List generateList(int lengthList) {
        listNumber_ = new ArrayList();
        for (int i = 0; i < lengthList; i++) {
            int randomNumber = ((int) ((Math.random() * ((maxNumber - minNumber) + 1)) + minNumber));
            listNumber_.add(randomNumber);
        }
        return listNumber_;

    }

    public int getCountOddNumber(List listNumber) {
        int countOddNumber = 0;
        listNumber = generateList(lengthList);
        for (int i = 0; i < lengthList; i++) {
            double a;
            a = (int) listNumber.get(i) % 2;
            if (a == 0) {
            } else countOddNumber++;
        }
        System.out.println("Cont Even number are: " + countOddNumber);
        return countOddNumber;
    }


    public void deleteEvenNumber(List listNumber) {
        double a;
        listNumber = generateList(lengthList);
        Iterator iterator = listNumber.iterator();
        List listOddNumber = new ArrayList();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            a = i % 2;
            if (a == 0) {
                iterator.remove();
                System.out.println("Delete elements " + i);
            } else {
                listOddNumber.add(i);
                System.out.println("Elements Ok " + i);
            }


        }
    }
    //Arr1[i] = ((int) ((Math.random() * ((10000 - 100) + 1)) + 100));
}
