import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> prime = new ArrayList<>();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                prime.add(i);
                sum += i;
            }
        }

        if (prime.size() == 0) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(sum + "\n" + prime.get(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int input) {
        if (input == 1) return false;
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }
}
