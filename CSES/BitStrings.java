import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BitStrings {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(BigInteger.TWO.pow(n).mod(BigInteger.valueOf((int)1e9+7)));
    }
}
