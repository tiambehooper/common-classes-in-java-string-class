package com.theironyard;

/**
 * For this exercise you will implement the methods described below. Each of
 * these methods are a type of exercise called a "kata". The word kata comes
 * from martial arts. In martial arts, katas are repetitive simple training
 * exercises. The idea is that, by doing the same movement or exercise over and
 * over again, it becomes second nature.
 *
 * In programming a kata is similar. It's a simple exercise that helps you
 * practice basic programming skills. They can be repeated from time to time to
 * help you keep your coding skills sharp and practice new techniques.
 *
 * The methods you will be creating are based off of katas from CodingBat.
 * You can see all of CodingBat's exercises at http://codingbat.com/.
 *
 * Each of the katas below are focused on string manipulation.
 */
public class StringKatas {

    /**
     * Create a publicly accessible static method that does the following:
     *
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *
     * Examples:
     *
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     *
     * This exercise is on CodingBat at http://codingbat.com/prob/p171896
     *
     * Note: You will need to use string concatenation to solve this problem.
     *
     * @param name The name you are greeting EG: "Bob"
     * @return A string greeting the name. EG: "Hello Bob!"
     */
    // todo: implement helloName() method
    public static String helloName(String name){


        return "Hello "+ name + "!";

    }

    /**
     * Create a publicly accessible static method that does the following:
     *
     * Given an "out" string length 4, such as "<<>>", and a word, return a new
     * string where the word is in the middle of the out string, e.g.
     * "<<word>>". Note: use str.substring(i, j) to extract the String starting
     * at index i and going up to but not including index j.
     *
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     *
     * This exercise is on CodingBat at http://codingbat.com/prob/p184030
     *
     * Note: You will need to use string concatenation as well as other  methods
     * on the string class to solve this problem. Pay particular attention to
     * the documentation as it relates to inclusiveness.
     *
     * @param out A four-letter string such as "[[]]"
     * @param word A word to place in the middle of the value of the `out` argument
     * @return A string with the word `word` placed in the middle of the `out` argument
     */
    // todo: implement makeOutWord() method
    public static String makeOutWord(String out, String word){


        return out.substring(0,2) + word + out.substring(2,4);

    }

    /**
     * Create a publicly accessible static method that does the following:
     *
     * Given a string of even length, return the first half. So the string
     * "WooHoo" yields "Woo".
     *
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     *
     * This exercise is on CodingBat at http://codingbat.com/prob/p172267
     *
     * @param str The string to return the first half of.
     * @return The first half of the string provided
     */
    // todo: implement firstHalf() method
       public static String firstHalf(String str){


         return str.substring(0, str.length()/2);




    }


        /**
         * Create a publicly accessible static method that does the following:
         *
         * Given a string and an int n, return a string made of the first and last n
         * chars from the string. The string length will be at least n.
         *
         * nTwice("Hello", 2) → "Helo"
         * nTwice("Chocolate", 3) → "Choate"
         * nTwice("Chocolate", 1) → "Ce"
         *
         * This exercise is on CodingBat at http://codingbat.com/prob/p174148
         *
         * Hint: With problems like this it is often useful to break it down into
         * a process (also known as an algorithm). Maybe you could attack this
         * problem by first getting the first n characters and making sure that
         * works as expected. Then get the last n characters and make sure that
         * works as expected. Finally, put them together for the correct result.
         * Keep in mind that failing tests show you what was expected vs. what was
         * actually received. You can use this to check incremental progress towards
         * a solution.
         *
         * @param str The string to extract the first/last characters from
         * @param n The number of characters to extract.
         * @return A string made up of the first n and last n characters of `str` concatenated together
         */
        // todo: implement nTwice() method
    public static String nTwice(String str, int n){


        String first = str.substring(0,n);
        String end = str.substring(str.length()-n);

        return first + end;

    }


    }