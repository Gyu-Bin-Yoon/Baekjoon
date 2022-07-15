import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());

        String num = br.readLine();
        int num2 = Integer.parseInt(num);
        String[] n = num.split("");

        int[] re = new int[3];
        for (int i = 2; i >= 0; i--) {
            re[i] = num1 * Integer.parseInt(n[i]);
            bw.write(String.valueOf(re[i]) + "\n");
        }
        int result = re[2] + re[1] * 10 + re[0] * 100;
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
