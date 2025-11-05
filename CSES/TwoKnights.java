import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TwoKnights {
    static String solve(int i){
//        long totalWays= ((i*i)*(i*i-1))/2;
//        long conflictingWays=4*(i-1)*(i-2);

        BigInteger i2=BigInteger.valueOf(i).pow(2);
        BigInteger totalWays= (i2.multiply(i2.subtract(BigInteger.ONE))).divide(BigInteger.TWO);
        BigInteger conflictingWays=BigInteger.valueOf(4).multiply(BigInteger.valueOf(i).subtract(BigInteger.ONE)).multiply(BigInteger.valueOf(i).subtract(BigInteger.TWO));
        return totalWays.subtract(conflictingWays).toString();


    }
    public static void main(String[] args)throws IOException {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(solve(i));
            if(i<n)sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
