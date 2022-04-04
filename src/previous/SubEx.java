package previous;

import java.util.HashMap;

public class SubEx {
    public static void main(String[] args){
        System.out.println("Hello");

        // s1 = "eat"  s2 = "tea"
        // s1 = "aabb"  s2 = "babb"

        // 0,1, 1, 2, 3, 5 ...
    }

    public boolean isAnagram(String s1, String s2){
        HashMap<Character,Integer> freqMap = new HashMap<>();
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len != s2Len){
            return false;
        }
        for(int i = 0; i < s1Len; i++){
            char ch = s1.charAt(i);
            freqMap.merge(ch,1,Integer::sum);
        }
        for(int i = 0; i < s2Len; i++){
            char ch = s2.charAt(i);
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch) - 1);
            }
            else{
                return false;
            }
        }

        for(char ch: freqMap.keySet()){
            if(freqMap.get(ch) != 0){
                return false;
            }
        }
        return true;

    }

    public void fibPrint(int num1, int num2, int curN){
        if(curN == 0){
            return;
        }
        int sum = num1 + num2;
        System.out.println(sum + " ");
        fibPrint(num2, sum, curN - 1);
    }

    public void fibDriver(int n){
        int num1 = 0;
        int num2 = 1;
        int curN = n - 2;
        fibPrint(num1,num2, curN);
    }




}
