package edu.sample;

import java.util.*;

public class CollectionService {


    public static List<Integer> addToCollection(Integer... numbers) {
        List<Integer> list = new ArrayList<>();

        for (Integer a :
                numbers) {

            list.add(a);
        }

        Collections.sort(list);
        return list;
    }

    public static List<List<Integer>> split(List<Integer> list, int parts){

        if(parts<0 || parts==0 || parts>list.size()){
            throw new WrongAmountException();
        }

        List<List<Integer>> finalList = new ArrayList<>();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            List sublist = new ArrayList(parts);
            for (int i = 0; i < parts; i++) {
                if (iterator.hasNext()) {
                    sublist.add(iterator.next());
                }
            }
            finalList.add(sublist);
        }

        return finalList;
    }

    public static List<List<Integer>> merge(List<Integer>... list1) {

        List<List<Integer>> mergedList = new ArrayList<>();
        return mergedList;
    }
}

