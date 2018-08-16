import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class Harshit_Maharshi {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Reading the text
		String text = br.readLine();
		int n = Integer.parseInt(br.readLine());
		String[] patterns = new String[n];
		//Reading patterns
		for(int i=0;i<n;i++)
			patterns[i] = br.readLine();
		//Function to get index for the patterns in the text
		getIndex(text, patterns);
	}
	
	static void getIndex(String t1, String[] pat) {
		int[] j = new int[pat.length];
		Arrays.fill(j,-1);
		int ch;
		for(int i=0;i<pat.length;) {
			ch = 0;
			while((j[i]=t1.indexOf(pat[i], j[i]+1)) != -1) {
				System.out.print(j[i]+" ");
				ch = 1;
				i++;
				break;
			}
			i=i==pat.length?0:i;
			if(ch==0)
				break;
		}
	}
}