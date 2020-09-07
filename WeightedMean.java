package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedMean {

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		sc.nextLine();
		String[] xVal = sc.nextLine().split(" ");
		String[] wVal = sc.nextLine().split(" ");
		
		ArrayList<Integer> X = new ArrayList<>();
		ArrayList<Integer> W = new ArrayList<>();
		double deno = 0;
		
		for(String x: xVal){
			X.add(Integer.parseInt(x));
		}
		
		for(String w: wVal){
			W.add(Integer.parseInt(w));
			deno += Integer.parseInt(w);
		}
		
		double weightedMean = 0;
		for(int i=0; i<N; i++){
			weightedMean += (X.get(i))*W.get(i);
		}
		weightedMean = weightedMean/deno;
		
		System.out.printf("%.1f %n", weightedMean);
	}
}
