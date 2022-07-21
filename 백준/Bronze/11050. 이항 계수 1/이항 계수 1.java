import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int tmp_n = n;
        int tmp_k = k;
        if (k == 0) {
            tmp_n = 1;
            tmp_k = 1;
        }
        for (int i = 0; i < k - 1; i++) {
            tmp_n *= n - (i + 1);
            tmp_k *= (i + 1);
        }

        bw.write(String.valueOf(tmp_n / tmp_k));
        bw.flush();
        bw.close();
        br.close();
    }
}
