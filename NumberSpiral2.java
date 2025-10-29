
import java.util.Scanner;

// Find the row and column number if a number is given in number spiral problem

public class NumberSpiral {

    static String  solve(Scanner sc) {
        int n;

        n = sc.nextInt();

        // find the number of loops completed
        int last = (int) Math.sqrt(n);
        int currentRowCol = last + 1;
        int diff = n - last * last;

        if (diff == 0) {
            if (last % 2 == 0) {
                return (last + "" + diff);
            } else {
                return (diff + "" + last);
            }
        } else if (currentRowCol % 2 == 0 && diff <= currentRowCol) {
           return (diff + "" + currentRowCol);
        } else {
            return (currentRowCol + "" + diff);
        }

    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t > 0) {
            sb.append(solve(sc));
            sb.append("\n");
            t--;
        }
        sc.close();
    }
}
