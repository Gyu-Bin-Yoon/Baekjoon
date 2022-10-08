import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long result = 0;

        int[] array = new int[N];
        long[] sum = new long[N];
        long[] r = new long[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
            if (i == 0) {
                sum[i] = (long)array[i];
            } else {
                sum[i] = sum[i - 1] + (long)array[i];
            }
        }

        for (int i = 0; i < M; i++) {
            r[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            sum[i] = sum[i] % M;
            if (sum[i] == 0) {
                result++;
            }
            r[(int)sum[i]]++;
        }

        for (int i = 0; i < M; i++) {
            if (r[i] > 1) {
                result += (r[i] * (r[i] - 1) / 2);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
