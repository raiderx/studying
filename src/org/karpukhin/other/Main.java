package org.karpukhin.other;


/*import java.util.Scanner;

public class Main {

    public static final double U = 36 * 1000 / 3600;
    public static final double A = 5;

    public static int f(double t) {
        return (int)(U*t+((A*t*t)/2));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double t1 = s.nextDouble();
        double t2 = s.nextDouble();
        System.out.println(f(t1));
        System.out.println(f(t2));
    }
}*/
/*
import java.util.Scanner;

public class Main {

    public static int f(int h) {
        int r = 0, j = 0;
        int[] d = {20, 10, 5};
        for (int i = 0; i < h; ++i) {
            r += d[j++];
            j = j % 3;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        int h3 = s.nextInt();
        int h4 = s.nextInt();
        System.out.println(f(h1));
        System.out.println(f(h2));
        System.out.println(f(h3));
        System.out.println(f(h4));
    }
}
*/
/*
import java.util.Scanner;

public class Main {

    public static void f(int h) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= h; ++i) {
            for (int j = 0; j < h-i; ++j) sb.append(' ');
            for (int j = 0; j < i; ++j) {
                sb.append(i);
                if (j < i)
                    sb.append(' ');
            }
            if (i < h)
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        int h3 = s.nextInt();
        f(h1);
        f(h2);
        f(h3);
    }
}
*/
/*
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void f(String h) {
        String[] ss = h.split("-");
        int y = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        Calendar c = Calendar.getInstance();
        c.set(y, m, 28);
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String h1 = s.nextLine();
        String h2 = s.nextLine();
        f(h1);
        f(h2);
    }
}
*/
/*
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        Map map = new HashMap();
        while ((line = scanner.nextLine()) != null && !"".equals(line)) {
            String[] ss = line.split("-");
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
                return -((Integer)o1).compareTo((Integer)o2);  //To change body of implemented methods use File | Settings | File Templates.
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
*/
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List result = new ArrayList();
        String line = scanner.next();
        while (scanner.hasNext()) {
            String[] words = line.split(" ");
            for (String w : words) {
                if (w.substring(0, 1).equals(w.substring(0, 1).toUpperCase()))
                    result.add(w);
            }
            line = scanner.next();
        }
        for (Object w : result) {
            System.out.println(w);
        }
    }
}*/
/*
public class Main {

    public static void main(String[] args) {
        for (int i = 258; i <= 393; ++i) {
            if ((i + 5) % 10 > 0) {
                System.out.println(i);
            }
        }
    }
}
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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