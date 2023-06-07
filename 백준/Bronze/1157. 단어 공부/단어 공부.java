import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();

		int[] freq = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			freq[c - 'A']++;
		}

		int max_freq = 0;
		char max_freq_char = '?';

		for (int i = 0; i < 26; i++) {
			int count = freq[i];
			if (count > max_freq) {
				max_freq = count;
				max_freq_char = (char) (i + 'A');
			} else if (count == max_freq) {
				max_freq = count;
				max_freq_char = '?';
			}
		}

		System.out.println(max_freq_char);
	}

}
