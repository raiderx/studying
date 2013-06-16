package org.karpukhin.elance.problem8;

/**
 Write a program which will accept three sentences (one sentence per line) and
 print the words having Initial Caps within the sentences. Below is an example.

 Here is an example. If the below three sentences are given to the program as input,

 This is a Program
 Coding test of Initial Caps
 the program Will Test You

 Then, the output would look like:

 This
 Program
 Coding
 Initial
 Caps
 Will
 Test
 You


 Note: In case of input data being supplied to the question, it should be assumed to be a console input.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List result = new ArrayList();
        while (scanner.hasNext()) {
            String w = scanner.next();
            if (w.substring(0, 1).equals(w.substring(0, 1).toUpperCase()))
                result.add(w);
        }
        for (Object w : result) {
            System.out.println(w);
        }
    }
}
