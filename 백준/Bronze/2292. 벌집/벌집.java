import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =Integer.parseInt(br.readLine());

        int check =1;
        int i=1;
        while(n>check){
            check += 6*i;
            i++;
        }

        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();
        br.close();
    }
}
