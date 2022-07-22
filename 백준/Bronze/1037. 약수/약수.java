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

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cd = new int[n];
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            cd[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                min = cd[i];
                max = cd[i];
            } else {
                if (cd[i] < min) min = cd[i];
                else if (cd[i] > max) max = cd[i];
            }
        }

        bw.write(String.valueOf(min * max));
        bw.flush();
        bw.close();
        br.close();
    }
}
