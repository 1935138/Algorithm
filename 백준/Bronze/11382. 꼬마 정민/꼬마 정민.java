import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(str.nextToken());
		BigInteger b = new BigInteger(str.nextToken());
		BigInteger c = new BigInteger(str.nextToken());
		
		System.out.println(a.add(b.add(c)));
	}
}