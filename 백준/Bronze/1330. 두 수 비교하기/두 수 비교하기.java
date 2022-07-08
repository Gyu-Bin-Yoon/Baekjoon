import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        if(num1 > num2){
            bw.write(">");
        } else if (num1 < num2) {
            bw.write("<");
        } else if (num1 == num2) {
            bw.write("==");
        }

        bf.close();
        bw.close();
    }
}
