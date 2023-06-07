import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tai_year = Integer.parseInt(br.readLine());
		System.out.println(tai_year - (2541 - 1998));
	}

}
