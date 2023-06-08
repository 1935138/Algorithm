import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		sb.append(num1 * (num2 % 10) + "\n");
		sb.append(num1 * (num2 / 10 % 10) + "\n");
		sb.append(num1 * (num2 / 100 % 10) + "\n");
		sb.append(num1 * num2 + "\n");

		System.out.println(sb);
	}
}
