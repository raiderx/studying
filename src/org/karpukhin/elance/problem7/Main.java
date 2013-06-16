package org.karpukhin.elance.problem7;

/**
 Write a program that accepts 10 student records (roll number and score) and
 prints them in decreasing order of scores. In case there are multiple records
 pertaining to the same student, the program should choose a single record
 containing the highest score. The program should be capable of accepting a
 multi-line input. Each subsequent line of input will contain a student record,
 that is, a roll number and a score (separated by a hyphen). The output should
 consist of the combination of roll number and corresponding score in
 decreasing order of score.

 INPUT to program

 1001-40
 1002-50
 1003-60
 1002-80
 1005-35
 1005-55
 1007-68
 1009-99
 1009-10
 1004-89

 OUTPUT from program

 1009-99
 1004-89
 1002-80
 1007-68
 1003-60
 1005-55
 1001-40


 Note: In case of input data being supplied to the question, it should be assumed to be a console input. 
 */
import java.util.*;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new HashMap();
        while (scanner.hasNext()) {
            String[] ss = scanner.nextLine().split("-");
            if (map.containsKey(ss[0])) {
                int v1 = (Integer)map.get(ss[0]);
                int v2 = Integer.parseInt(ss[1]);
                if (v2 > v1)
                    map.put(ss[0], v2);
            } else {
                map.put(ss[0], Integer.parseInt(ss[1]));
            }
        }
        Map other = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -((Integer)o1).compareTo((Integer)o2);
            }
        });
        for(Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry)obj;
            other.put(entry.getValue(), entry.getKey());
        }
        for(Object obj : other.entrySet()) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getValue() + "-" + entry.getKey());
        }
    }
}
