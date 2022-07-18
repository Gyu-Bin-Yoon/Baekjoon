import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int mul = num1*num2*num3;
        String mul_s = String.valueOf(mul);
        int[] check = new int[10];

        for(int i=0;i<mul_s.length();i++){
            int index = mul_s.charAt(i)-48;
            check[index]++;
        }

        for(int i=0;i<10;i++){
            bw.write(check[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
