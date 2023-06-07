import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(stz.nextToken());
		int B = Integer.parseInt(stz.nextToken());
		int C = Integer.parseInt(stz.nextToken());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		sb.append((A + B) % C).append("\n")
				.append(((A % C) + (B % C)) % C).append("\n")
				.append((A * B) % C).append("\n")
				.append(((A % C) * (B % C)) % C).append("\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
