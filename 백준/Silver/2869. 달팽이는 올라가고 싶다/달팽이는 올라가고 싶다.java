import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger V = new BigInteger(st.nextToken());

        BigInteger r = V.subtract(A).remainder(A.subtract(B));
        BigInteger q = V.subtract(A).divide(A.subtract(B));

        if (r.compareTo(new BigInteger("0")) == 0) bw.write(String.valueOf(q.add(new BigInteger("1"))));
        else bw.write(String.valueOf(q.add(new BigInteger("2"))));

        bw.flush();
        bw.close();
        br.close();
    }
}
