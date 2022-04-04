package previous;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(arr, N);
        System.out.println(out);
    }
    public static long solve(long[] arr, long N){
    	Map<Long, Integer> frequencyMap = new HashMap<Long,Integer>();
    	for(long num: arr) {
    		frequencyMap.putIfAbsent(num, 0);
    		frequencyMap.put(num, frequencyMap.get(num) + 1);
    	}
    	Integer total = 0;
    	for(Map.Entry<Long, Integer> entry : frequencyMap.entrySet()) {
    		Long square = (long) Math.pow(entry.getKey(),2);
    		if(frequencyMap.containsKey(square)) {
    			Integer A_j = frequencyMap.get(square);
    			if (square != 1) {
					total = total + (entry.getValue() * A_j);
				}
    			else {
    			    Integer freq = entry.getValue();
    			    total = total + (freq * (freq -1));
    			}
    		}
    	}
    	
		return total;
       
    }
}