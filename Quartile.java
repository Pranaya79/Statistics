package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quartile {
	
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] quartiles = new int[N];
		for(int i=0; i<N; i++){
			quartiles[i] = sc.nextInt();
		}
		Arrays.sort(quartiles);
		int Q1 = findQuartiles(quartiles, 0, quartiles.length/2 - 1);
		int Q2 = findQuartiles(quartiles, 0, quartiles.length - 1);
		int Q3 = findQuartiles(quartiles, (quartiles.length + 1)/2, quartiles.length - 1);
		System.out.println(Q1+"\n"+Q2+"\n"+Q3+"\n");
		
		sc.close();
	}
	
	private static int findQuartiles(int[] array, int start, int end){
		if((end-start)%2 == 0){
			return array[(end+start)/2];
		} else{
			int v1 = array[(end+start)/2];
			int v2 = array[(end+start)/2+1];
			return Math.round((v1+v2)/2);
		}
	}

}

/*sc.nextLine();
String[] qVal = sc.nextLine().split(" ");
ArrayList<Integer> quartiles = new ArrayList<>();
for(String s: qVal){
	quartiles.add(Integer.parseInt(s));
}
Collections.sort(quartiles);*/

