import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    int swap = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = swap;
                }
                else break;
            }
        }

        for(int i=0;i<n;i++){
            bw.write(num[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
