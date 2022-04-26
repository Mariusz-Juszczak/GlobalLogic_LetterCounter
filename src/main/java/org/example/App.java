package org.example;

import java.util.Map;
import java.util.TreeMap;

public class App
{
    static Map<Character, Integer> letterScan(String word) {

        TreeMap<Character, Integer> lettersMap = new TreeMap<>();

        word.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c )
                .forEach(c -> {
                    if (lettersMap.containsKey(c)) {
                        lettersMap.put(c, lettersMap.get(c) + 1);
                    } else {
                        lettersMap.put(c, 1);
                    }
                });
        return lettersMap;
    }

    public static void main( String[] args ) {

        if (args.length == 0) {
            System.out.println("Please provide String as an argument");
        } else { System.out.println(letterScan(args[0]).entrySet()); }
    }
}
