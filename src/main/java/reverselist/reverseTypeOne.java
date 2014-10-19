package reverselist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 8/3/13
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class reverseTypeOne {
    private static List<Integer> createAndPopulateIntegerList() {
        List<Integer> list = new ArrayList<Integer>();
        ListIterator listIterator = list.listIterator();
        listIterator.add(1);
        listIterator.add(2);
        listIterator.add(3);
        listIterator.add(4);
        listIterator.add(5);
        return list;
    }

    private static List<Integer> reverseList(List<Integer> directList) {
        List<Integer> reversedList = new ArrayList<Integer>(directList.size());
        ListIterator directListIterator = directList.listIterator();
        ListIterator reverseListIterator = directList.listIterator();

        while (directListIterator.hasNext()) {
            directListIterator.next();
        }
           while (directListIterator.hasPrevious()) {
               reversedList.add((Integer)directListIterator.previous());
           }

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> directList = createAndPopulateIntegerList();
        ListIterator directListIterator = directList.listIterator();

        List<Integer> reversedList = reverseList(directList);
           ListIterator reverseListIterator = reversedList.listIterator();

        while (directListIterator.hasNext()) {
            System.out.println("Next element = " + directListIterator.next());
        }

        for (Integer curInt : reversedList) {
            System.out.println("Next element: " + curInt);
        }

    }

}
