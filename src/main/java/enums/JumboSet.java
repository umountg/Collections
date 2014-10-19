package enums;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 8/4/13
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class JumboSet {
    public static void main(String[] args) {
        long[] elements = new long[(129 + 63) >>> 6];
        for (long a : elements) {
            Long aa = new Long(a);
            System.out.println(aa.byteValue());
        }
    }
}
