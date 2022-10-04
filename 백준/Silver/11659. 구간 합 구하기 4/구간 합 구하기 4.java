import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] num = new int[N];
        int[] S = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st2.nextToken());
            if (i == 0) S[i] = num[i];
            else S[i] = S[i - 1] + num[i];
        }

        for (int index = 0; index < M; index++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st3.nextToken());
            int j = Integer.parseInt(st3.nextToken());

            bw.write((S[j - 1] - S[i - 1] + num[i - 1]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
