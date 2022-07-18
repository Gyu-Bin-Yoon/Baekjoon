import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger p = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> prime = primeList(k);

        BigInteger zero = new BigInteger("0");
        for (int i = 0; i < prime.size(); i++) {
            if (p.remainder(BigInteger.valueOf(prime.get(i))).compareTo(zero)==0) {
                bw.write("BAD " + prime.get(i));
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        bw.write("GOOD");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int n) {
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static ArrayList primeList(int k) {
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i < k; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }

        return prime;
    }
}
