import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(bf.readLine());
        BigInteger B = new BigInteger(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(A.add(B)) + "\n");
        bw.write(String.valueOf(A.subtract(B))+ "\n");
        bw.write(String.valueOf(A.multiply(B)));
        bw.flush();

        bf.close();
        bw.close();
    }
}