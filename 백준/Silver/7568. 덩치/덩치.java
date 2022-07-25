import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] big = new int[num][2];
        int[] level = new int[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            big[i][0] = Integer.parseInt(st.nextToken());
            big[i][1] = Integer.parseInt(st.nextToken());
            level[i] = 1;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (big[j][0] > big[i][0] && big[j][1] > big[i][1]) level[i]++;
            }
        }
        for (int i = 0; i < num; i++) {
            bw.write(level[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
