import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stz.nextToken());
			int b = Integer.parseInt(stz.nextToken());
			if (a == 0 && b == 0) {
				break;
			}
			sb.append(a + b).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}