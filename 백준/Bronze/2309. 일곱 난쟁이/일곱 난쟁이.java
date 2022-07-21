import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] height = new int[9];
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            total += height[i];
        }

        for (int i = 0; i < height.length; i++) {
            for (int j = i; j > 0; j--) {
                if (height[j] < height[j - 1]) {
                    int swap = height[j];
                    height[j] = height[j - 1];
                    height[j - 1] = swap;
                }
            }
        }

        int two_sum = total - 100;

        loop:
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] + height[j] == two_sum) {
                    for (int k = 0; k < height.length; k++) {
                        if (k == i || k == j) continue;
                        else bw.write(height[k] + "\n");
                    }

                    break loop;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
