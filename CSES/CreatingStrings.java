import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CreatingStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int total = (int) Math.pow(2, s.length());

        Set<String> resultSet = new HashSet<>();
        String next = s;
        for (int i = 0; i < total; i++) {
            resultSet.add(next);
            next = nextPermutation(next);
        }
        StringBuilder result = new StringBuilder();
        for (String it : resultSet) {
            result.append(it).append("\n");
        }
        System.out.println(resultSet.size());
        System.out.println(result.toString().trim());
    }

    static String nextPermutation(String s) {
        char[] chArray = s.toCharArray();
        int i = chArray.length - 2;
        while (i >= 0 && chArray[i] >= chArray[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = chArray.length - 1;
            while (j >= i && chArray[i] >= chArray[j]) {
                j--;
            }
            swap(chArray, i, j);
        }
        reverse(chArray, i + 1, chArray.length - 1);
        return new String(chArray);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
