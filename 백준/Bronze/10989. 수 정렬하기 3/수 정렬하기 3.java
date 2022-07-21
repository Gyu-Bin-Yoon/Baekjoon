import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[10001];
        for (int i = 0; i < num.length; i++) {
            num[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(br.readLine());
            num[index]++;
        }
        for (int i = 0; i < num.length; i++) {
            while (num[i] > 0) {
                bw.write(i + "\n");
                num[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
