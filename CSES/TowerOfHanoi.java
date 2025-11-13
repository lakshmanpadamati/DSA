import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TowerOfHanoi {
    static void solve(char A,char B,char C,int n,StringBuilder sb){
        if(n>0) {
            solve(A, C, B, n - 1, sb);
            sb.append(A).append(" ").append(C).append("\n");
            solve(B, A, C, n - 1, sb);
        }
    }
    public static void main(String[] args)throws Exception {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        solve('1','2','3',n,sb);
        System.out.println((int)Math.pow(2,n)-1);
        System.out.println(sb.toString().trim());

    }
}
