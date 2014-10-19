package wordscounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 8/3/13
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class WordsCounter {
    private static List<String> readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/MumboJumbo/Documents/Idea/Java/Collections/src/main/java/wordscounter/text.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append('\n');
                line = br.readLine();
            }
            String everything = sb.toString().replaceAll("[\n\r]", "");
            //  System.out.println(everything);

            List<String> words = Arrays.asList(everything.split(" "));

            return words;

        } finally {
            br.close();
        }


    }

    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        List<String> words = readFromFile();

        ListIterator wordsIterator = words.listIterator();
        ArrayList<Integer> positions;
        Integer currentWordPosition = 0;

        while (wordsIterator.hasNext()) {
            currentWordPosition++;


            String currentWord = (String) wordsIterator.next();
            if (map.get(currentWord) != null) {
                positions = map.get(currentWord);
            } else {
                positions = new ArrayList<Integer>();

            }
            positions.add(currentWordPosition);
            map.put(currentWord, positions);


        }

        for (String key : map.keySet()) {
            System.out.println( "Word: " + key +". Position in text: " +map.get(key));
        }
    }
}
