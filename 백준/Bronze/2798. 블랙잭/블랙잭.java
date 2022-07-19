import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st2.nextToken());
            for (int j = i; j > 0; j--) {
                if (card[j] < card[j - 1]) {
                    int swap = card[j];
                    card[j] = card[j - 1];
                    card[j - 1] = swap;
                } else break;
            }
        }

        int max = -1;
        for (int i = n - 1; i > 1; i--) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= m) {
                        if (max == -1) max = sum;
                        else if (max < sum) max = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();


    }
}
