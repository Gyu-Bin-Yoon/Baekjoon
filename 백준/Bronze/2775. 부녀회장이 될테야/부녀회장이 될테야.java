import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int case_num = Integer.parseInt(br.readLine());

        for (int i = 0; i < case_num; i++) {
            int floor = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());

            bw.write(people(floor, num) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static int people(int floor, int num) {
        if (floor == 0) return num;
        else if (num == 1) return 1;
        else return people(floor, num - 1) + people(floor - 1, num);
    }
}
