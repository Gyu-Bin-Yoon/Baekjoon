import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(getFi(input)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getFi(int index) {
        ArrayList<Long> fi = new ArrayList<Long>();
        fi.add((long) 0);
        fi.add((long) 1);
        if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                fi.add(fi.get(i) + fi.get(i + 1));
            }
        }

        return fi.get(index);
    }
}

