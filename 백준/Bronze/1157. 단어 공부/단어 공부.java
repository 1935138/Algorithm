import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		char freq_char = '?';
		int max_count = 0;
		
		while(str.length() != 0) {
			String new_str = str.replaceAll(Character.toString(str.charAt(0)),"");
			int count = str.length() - new_str.length();
			if(count > max_count) {
				freq_char = str.charAt(0);
				max_count = count;
			} else if(str.length() - new_str.length() == max_count) {
				freq_char = '?'; // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
			}
			str = new_str;
		}
		
		System.out.println(freq_char);
	}

}
