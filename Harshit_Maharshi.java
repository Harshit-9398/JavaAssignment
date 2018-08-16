import java.io.*;
import java.util.*;
class Harshit_Maharshi {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int ch, i, n = Integer.parseInt(br.readLine());
		String[] m = new String[n];
		int[] j = new int[n];
		Arrays.fill(j,-1);
		for(i=0;i<n;i++)
			m[i] = br.readLine();
		for(i=0;i<n;) {
			ch = 0;
			while((j[i]=str.indexOf(m[i], j[i]+1)) != -1) {
				System.out.print(j[i]+" ");
				ch = 1;
				i++;
				break;
			}
			i=i==n?0:i;
			if(ch==0)
				break;
		}
	}
}