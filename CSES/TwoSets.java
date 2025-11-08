import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoSets {
    public static void main(String[] args) throws Exception {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        long sum = ((long)n * (n + 1)) / 2;
        if (sum % 2 == 1) {
            System.out.println("NO");
        } else {
            long reqSum = sum / 2;
            long curSum=0;
            int count1=0;
            for (int i = n; i >= 1; i--) {
                if (curSum+i<=reqSum){
                    curSum+=i;
                    count1++;
                    sb1.append(i);
                    sb1.append(" ");
                }
                else{
                    sb2.append(i);
                    sb2.append(" ");
                }

            }
            System.out.println("YES");
            System.out.println(count1);
            System.out.println(sb1.toString().trim());
            System.out.println(n-count1);
            System.out.println(sb2.toString().trim());
        }
    }
}
