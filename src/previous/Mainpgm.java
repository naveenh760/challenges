package previous;

public class Mainpgm {

	public static void main(String[] args) {
		System.out.println(solve("saurabh"));
		System.out.println(solve("sorabh"));
		

	}
	
	public static String solve(String A) {
		boolean edible = false;
		for(int i = 0; i < A.length(); i++) {
			if(isVowel(A.charAt(i))) {
				if(isPrime(i + 1)) {
					edible =true;
				}
				else {
					edible = false;
					break;
				}
			}
		}
		
		if(edible) {
			return "YES";
		}
		else return "NO";
		
		
	}
	
	public static boolean isPrime(int n) {
		for(int x = 2; x*x <= n; x++) {
			if(n % x == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isVowel(char letter) {
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		}
		else {
			return false;
		}
	}

}
