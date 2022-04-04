package previous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sigmoid {

    public static void main(String[] args){
        String a = "text";
        String b = "ttxe";
        String c = "";
        String d = "";
     //   System.out.println(isAnagram(c,d));
        int[] arr = {};
        int[] result = nextGreater(arr);
        for(int num: result){
            System.out.print(num + " ");
        }

    }


    public static boolean isAnagram(String A, String B){
        Map<Character,Integer> aFreq = new HashMap<>();
        Map<Character,Integer> bFreq = new HashMap<>();
        computeFrequency(A,aFreq);
        computeFrequency(B, bFreq);
        if(aFreq.equals(bFreq)){
            return true;
        }
        return false;
    }

    private static void computeFrequency(String a, Map<Character, Integer> freqMap) {
        int n = a.length();
        for(int i = 0; i < n; i++){
            freqMap.merge(a.charAt(i),1,Integer::sum);
        }
    }

    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            boolean found = false;
            int index = - 1;
            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[i]){
                    found = true;
                    index = j;
                    break;
                }
            }
            if(found){
                result[i] = arr[index];
            }
            else{
                result[i] = -1;
            }
        }
        return result;
    }

}
