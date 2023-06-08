import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				StringTokenizer stz = new StringTokenizer(br.readLine());
				if (stz.countTokens() == 0)
					break;
				int a = Integer.parseInt(stz.nextToken());
				int b = Integer.parseInt(stz.nextToken());
				System.out.println(a + b);
			} catch (NullPointerException e) {
				break;
			}

		}
	}

}
