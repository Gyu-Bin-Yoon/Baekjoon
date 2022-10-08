import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N + 1][N + 1];
        int[][] sum = new int[N + 1][N + 1];

        for (int i = 0; i < N + 1; i++) {

            if (i == 0) {
                for (int j = 0; j < N + 1; j++) {
                    array[i][j] = 0;
                }
                continue;
            }

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N + 1; j++) {

                if (j == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = Integer.parseInt(st2.nextToken());
                }


                if (i == 0 || j == 0) {
                    sum[i][j] = 0;
                } else if (i == 1) {
                    if (j == 1) sum[i][j] = array[i][j];
                    else sum[i][j] = array[i][j] + sum[i][j - 1];
                } else if (j == 1) {
                    sum[i][j] = array[i][j] + sum[i - 1][j];
                } else {
                    sum[i][j] = array[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            bw.write(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
