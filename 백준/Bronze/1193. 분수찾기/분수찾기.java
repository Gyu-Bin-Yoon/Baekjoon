import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0, row = 0;
        while (sum < n) {
            row++;
            sum += row;
        }

        int col = n - (sum - row);
        if (row % 2 == 0) {
            bw.write(col + "/" + (row - col + 1));
        } else {
            bw.write((row - col + 1) + "/" + col);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
