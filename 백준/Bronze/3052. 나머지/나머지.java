import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remainder = new int[10];
        int diff = 0;
        for (int i = 0; i < 10; i++) {
            remainder[i] = Integer.parseInt(br.readLine()) % 42;
            if (i == 0) diff++;
            else {
                boolean different = true;
                for (int j = 0; j < i; j++)
                    if (remainder[j] == remainder[i]) different = false;
                if (different) diff++;
            }
        }

        bw.write(String.valueOf(diff));
        bw.flush();
        bw.close();
        br.close();
    }
}
