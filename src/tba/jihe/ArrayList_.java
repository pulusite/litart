package tba.collection;

import tba.jihe.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongzhang on 5/16/17.
 */
public class ArrayList_ {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(null);
        if (list==null || list.isEmpty()){
            System.out.println("null");
        }
        System.out.println();
    }
}
