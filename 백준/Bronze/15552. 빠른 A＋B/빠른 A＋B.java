import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stz.nextToken());
			int b = Integer.parseInt(stz.nextToken());

			sb.append(a + b).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
