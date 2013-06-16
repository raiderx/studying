package org.karpukhin.elance.problem10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("^[^\\s]{5,10}$");
        Pattern p2 = Pattern.compile("[0-9]+");
        Pattern p3 = Pattern.compile("[A-Z]+");
        Pattern p4 = Pattern.compile("[@#*=]+");
        Scanner scanner = new Scanner(System.in);
        String line;

        List result = new ArrayList();
        while ((line = scanner.nextLine()) != null && !"".equals(line)) {
            //while (scanner.hasNext()) {
            //    line = scanner.next();
            Matcher m1 = p1.matcher(line);
            Matcher m2 = p2.matcher(line);
            Matcher m3 = p3.matcher(line);
            Matcher m4 = p4.matcher(line);
            //result.add(line + "*");
            if (m1.matches() && m2.matches() && m3.matches() && m4.matches()) {
                //System.out.println("PASS");
                result.add("PASS");
            } else {
                //System.out.println("FAIL");
                result.add("FAIL");
            }
        }
        for (Object w : result) {
            System.out.println(w);
        }
    }
}
