import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class No_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int i = 0;
		while(i<num) {
			arr[i] = Integer.parseInt(br.readLine());
			i++;
		}
		Arrays.sort(arr);
		for(int j = 0; j< arr.length; j++) {
			bw.write(arr[j]+"\n");
		}
		bw.close();
	}
}