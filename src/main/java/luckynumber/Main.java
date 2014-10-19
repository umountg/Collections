package luckynumber;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FunnyList<Integer> funnyList = new FunnyList<Integer>();
        Iterator itr = funnyList.iterator();

        funnyList.add(11);
        funnyList.add(19);
        funnyList.add(17);
        funnyList.add(12);
        funnyList.add(13);
        System.out.println("Random element " + itr.next());

        funnyList.add(14);

        while (itr.hasNext()){
            System.out.println("Random element " + itr.next());
        }

        // String
        FunnyList<String> strFunnyList = new FunnyList<String>();
        Iterator strItr = strFunnyList.iterator();

        strFunnyList.add("A");
        strFunnyList.add("B");
        strFunnyList.add("C");
        strFunnyList.add("D");
        strFunnyList.add("E");
        System.out.println("Random element " + strItr.next());

        strFunnyList.add("F");

        while (strItr.hasNext()){
            System.out.println("Random element " + strItr.next());
        }

    }
}
