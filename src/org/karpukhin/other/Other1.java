package org.karpukhin.other;

/**
 * @author Pavel Karpukhin
 */
public class Other1 {

    public static final int MIN = 0;
    public static final int MAX = 14;

    public static final int[][] table = {
            {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public static void main(String[] args) {
        for (int i = 1; i < table.length; ++i) {
            for (int j = 0; j < i; ++j) {
                int t = table[i][j];
                table[i][j] = table[j][i];
                table[j][i] = t;
            }
        }
        checkTable(1, 0);
        checkTable(1, 2);
        checkTable(2, 6);
        checkTable(12, 7);

        checkTable2(1, 0);
        checkTable2(1, 2);
        checkTable2(2, 6);
        checkTable2(12, 7);
    }

    public static int checkDst(int x, int y, int dx, int dy) {
        int cx = x, cy = y;
        int c = 0;
        while (cx >= MIN && cx <= MAX && cy >= MIN && cy <= MAX && table[cx][cy] == 1) {
            ++c;
            cx += dx;
            cy += dy;
        }
        dx = -dx;
        dy = -dy;
        cx = x + dx;
        cy = y + dy;
        while (cx >= MIN && cx <= MAX && cy >= MIN && cy <= MAX && table[cx][cy] == 1) {
            ++c;
            cx += dx;
            cy += dy;
        }
        return c;
    }

    public static void checkTable2(int x, int y) {
        if (checkDst(x, y, 1, 0) >= 5) {
            System.out.println("X You win");
        }
        if (checkDst(x, y, 0, 1) >= 5) {
            System.out.println("Y You win");
        }
        if (checkDst(x, y, 1, 1) >= 5) {
            System.out.println("A You win");
        }
        if (checkDst(x, y, 1, -1) >= 5) {
            System.out.println("B You win");
        }
    }

    public static void checkTable(int x, int y) {
        // qDebug()<<"x y"<<x<<""<<y;
        int fiveRows, cx, cy;
        fiveRows = 0;
        cx = x;
        cy = y;
        while (cx > (x - 5) && cx >= 0) {
            for (int i = 0; i < 5; ++i) {
                if (cx >= MIN && cx + i <= MAX) {
                    // qDebug()<<"x "<<c+i;
                    if (table[cx + i][y] == 1)
                        fiveRows++;
                }
            }
            // qDebug()<<"Xrows "<<fiveRows;
            if (fiveRows == 5) {
                //qDebug() << "X You win";
                System.out.println("X You win");
                fiveRows = 0;
            } else {
                fiveRows = 0;
            }
            cx--;
        }
        while (cy > (y - 5) && cy >= 0) {
            for (int i = 0; i < 5; ++i) {
                if (cy >= MIN && cy + i <= MAX) {
                    // qDebug()<<"y "<<cy+i;
                    if (table[x][cy + i] == 1)
                        fiveRows++;
                }
            }
            // qDebug()<<"Yrows "<<fiveRows;
            if (fiveRows == 5) {
                //qDebug() << "Y You win";
                System.out.println("Y You win");
                fiveRows = 0;
            } else {
                fiveRows = 0;
            }
            cy--;
        }
        cx = x;
        cy = y;
        while (cy > (y - 5) && cx > (x - 5)) {
            for (int i = 0; i < 5; ++i) {
                if (cy >= MIN && cy + i <= MAX && cx >= MIN && cx + i <= MAX) {
                    // qDebug()<<cx+i<<" "<<cy+i;
                    if (table[cx + i][cy + i] == 1)
                        fiveRows++;
                }
            }
            //qDebug()<<"Arows "<<fiveRows;
            if (fiveRows == 5) {
                //qDebug() << "A You win";
                System.out.println("A You win");
                fiveRows = 0;
            } else {
                fiveRows = 0;
            }
            cy--;
            cx--;
        }
        cx = x;
        cy = y;
        while (cy < (y + 5) && cx > (x - 5)) {
            for (int i = 0; i < 5; ++i) {
                if (cy - i >= MIN && cy <= MAX && cx >= MIN && cx + i <= MAX) {
                    // qDebug()<<cx+i<<" "<<cy-i;
                    if (table[cx + i][cy - i] == 1)
                        fiveRows++;
                }
            }
            //qDebug()<<"Brows "<<fiveRows;
            if (fiveRows == 5) {
                //qDebug() << "B You win";
                System.out.println("B You win");
                fiveRows = 0;
            } else {
                fiveRows = 0;
            }
            cy++;
            cx--;
        }
    }
}
