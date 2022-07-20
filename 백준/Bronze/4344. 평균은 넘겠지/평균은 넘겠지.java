import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int casenum = Integer.parseInt(br.readLine());

        for (int i = 0; i < casenum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student_num = Integer.parseInt(st.nextToken());

            int[] score = new int[student_num];
            int sum = 0;
            for (int j = 0; j < student_num; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }

            float average = (float) sum / student_num;
            int num = 0;
            for (int j = 0; j < student_num; j++) {
                if (average < score[j]) num++;
            }
            float ratio = (float) num / student_num * 100;
            bw.write(String.format("%.3f", ratio));
            bw.write("%\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
