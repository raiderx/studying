package org.karpukhin.elance.problem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] se1 = scanner.nextLine().split(",");
        String[] se2 = scanner.nextLine().split(",");
        Set set = new HashSet(Arrays.asList(se1));
        int c = 0;
        for (String s : se2)
            if (set.contains(s))
                ++c;
        System.out.println(c);
    }
}
