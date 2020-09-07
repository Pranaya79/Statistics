package HackerRank;

import java.util.Scanner;

public class StandardDeviation {
	
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] values = new int[N];
		for(int i=0; i<N; i++){
			values[i] = sc.nextInt();
		}
		
		double mean = 0.0;
		double[] sqrdDist = new double[N];
		double deviation = 0.0;
		
		for(int a=0; a<N; a++){
			mean += values[a];
		}
		mean = mean/N;
		
		for(int b=0; b<N; b++){
			sqrdDist[b] = Math.pow((values[b]-mean), 2);
		}
		
		for(int c=0; c<N; c++){
			deviation += sqrdDist[c];
		}
		deviation = Math.sqrt(deviation/N);
		
		System.out.printf("%.1f\n", deviation);
	}

}
