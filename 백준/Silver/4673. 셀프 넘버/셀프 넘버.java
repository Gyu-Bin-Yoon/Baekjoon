import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] all = new int[10000];
        for (int i = 0; i < 10000; i++) {
            all[i] = 1;
        }
        for (int i = 1; i < 10000; i++) {
            int length = String.valueOf(i).length();

            int[] a = new int[length];
            int not_self_num = 0;
            for (int j = 0; j < length; j++) {
                a[j] = String.valueOf(i).charAt(j) - 48;

                not_self_num += a[j] * Math.pow(10, length - (j + 1)) + a[j];
            }

            if (not_self_num <= 10000) {
                all[not_self_num - 1] = 0;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (all[i] == 1) {
                bw.write((i + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();

    }

}
