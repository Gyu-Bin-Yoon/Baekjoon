import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            boolean[] check = new boolean[26];
            for (int j = 0; j < 26; j++) {
                check[j] = false;
            }

            boolean group = true;
            for (int j = 0; j < word.length(); j++) {
                if (j > 0) {
                    if (word.charAt(j) != word.charAt(j - 1)) {
                        if (check[word.charAt(j) - 97]) {
                            group = false;
                            break;
                        } else check[word.charAt(j) - 97] = true;
                    }
                } else {
                    check[word.charAt(j) - 97] = true;
                }
            }

            if (group) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
