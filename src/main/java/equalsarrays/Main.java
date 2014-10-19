package equalsarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 8/3/13
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        List<MyClass> myClassesA = new ArrayList<MyClass>();
        List<MyClass> myClassesB = new ArrayList<MyClass>();

        MyClass a1 = new MyClass(1);
        MyClass a2 = new MyClass(2);
        MyClass a3 = new MyClass(3);

        MyClass b1 = new MyClass(1);
        MyClass b2 = new MyClass(2);
        MyClass b3 = new MyClass(3);

        myClassesA.add(a1);
        myClassesA.add(a2);
        myClassesA.add(a3);

        myClassesB.add(b1);
        myClassesB.add(b2);
        myClassesB.add(b3);

        if (myClassesA.equals(myClassesB)) {
            System.out.print("Equal");
        }
        else
            System.out.print("Not equal");

    };

}
