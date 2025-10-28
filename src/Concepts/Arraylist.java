package Concepts;
import java.util.ArrayList;
import java.lang.Integer;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);
    }
}
