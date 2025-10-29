
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSpiral {

    static String solve(BufferedReader br) throws IOException {
        Long m, n;

        String[] parts = br.readLine().split(" ");
        m = Long.parseLong(parts[0]);
        n = Long.parseLong(parts[1]);

        Long maxi = Math.max(m, n);
        Long dig = (maxi * maxi) - (maxi - 1);

        if (maxi % 2 == 0) {
            if (m < n) {
                return String.valueOf(dig - Math.abs(m - n));
            }
            return String.valueOf(dig + Math.abs(m - n));

        } else {
            if (m < n) {
                return String.valueOf(dig + Math.abs(m - n));
            } else {
                return String.valueOf(dig - Math.abs(m - n));
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t > 0) {
            sb.append(solve(br));
            if (t > 1) {
                sb.append("\n");
            }
            t--;
        }
        System.out.println(sb.toString());

    }
}
