import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		String str;

		while ((str = br.readLine()) != null) {
			stz = new StringTokenizer(str);
			int a = Integer.parseInt(stz.nextToken());
			int b = Integer.parseInt(stz.nextToken());
			System.out.println(a + b);
		}
	}

}
