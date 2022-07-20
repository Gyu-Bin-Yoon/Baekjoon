import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int newint = n;
        int count = 0;
        do {
            newint = newInt(newint);
            count++;
        } while (newint != n);

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int newInt(int n) {
        if (n < 10) {
            return n * 10 + n;
        } else {
            int ten = n / 10;
            int one = n % 10;

            return one * 10 + (ten + one) % 10;
        }
    }
}
