package previous;


import java.util.*;



class TestClass1 {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        long L = 0, R = 0;
        int STEP_SIZE = 0;
        
        L = sc.nextLong();
        R = sc.nextLong();
        STEP_SIZE = sc.nextInt();
        
        int N = sc.nextInt();
        Long arr[] = new Long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(L, R, STEP_SIZE, arr, N);
        System.out.println(out);
    }
    
    public static long solve(long L, long R, int STEP_SIZE, Long[] arr, long N){
    	List<Long> leftPos = new ArrayList<Long>();
    	List<Long> rightPos = new ArrayList<Long>();
    	List<Long> bombPos = Arrays.asList(arr);
        // Can be solved using list.retainAll method 
    	//https://www.geeksforgeeks.org/find-common-elements-in-two-arraylists-in-java/
    	
		return N;
        // Write your code here
    }
}
