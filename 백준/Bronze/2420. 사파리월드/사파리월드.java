import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(str.nextToken());
		BigInteger m = new BigInteger(str.nextToken());
		
		System.out.println(n.subtract(m).abs());		
	}
}