import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		
		int count = 0 + 1;
		
		for(char c : str.toCharArray()) {
			if(c == ' ') {
				count++;
			}
		}
		
		if(str.length() == 0){
			System.out.println(0);
		} else{
			System.out.println(count);
		}
	}
}