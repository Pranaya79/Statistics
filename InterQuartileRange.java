package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InterQuartileRange {
	
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] data = new int[n];
		for(int i=0; i<n; i++){
			data[i] = sc.nextInt();
		}
		
		int[] freq = new int[n];
		for(int j=0; j<n; j++){
			freq[j] = sc.nextInt();
		}
		
		List<Integer> range = new ArrayList<>();
		for(int k=0; k<n; k++){
			for(int m=0; m<freq[k]; m++){
				range.add(data[k]);
			}
		}
		Collections.sort(range);
		
		double Q1 = findQuartiles(range, 0, range.size()/2 - 1);
		double Q2 = findQuartiles(range, 0, range.size() - 1);
		double Q3 = findQuartiles(range, (range.size() + 1)/2, range.size() - 1);
		System.out.printf("%.1f\n", Q3-Q1);
		
		sc.close();
	}
	
	private static int findQuartiles(List<Integer> range, int start, int end){
		if((end-start)%2 == 0){
			return range.get((end+start)/2);
		} else{
			int v1 = range.get((end+start)/2);
			int v2 = range.get((end+start)/2+1);
			return Math.round((v1+v2)/2);
		}
	}

}
