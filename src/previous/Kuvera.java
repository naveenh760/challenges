package previous;

public class Kuvera {

    public static void main(String[] args){
        int number = 8;
        System.out.println(binaryGap1(number));
    }

    public static int binaryGap(int number){
        String binary = Integer.toBinaryString(number);
        int n = binary.length();
        int maxCount = 0;
        for(int i = 0; i < n; i++){
            char curChar = binary.charAt(i);
            if(curChar == '0'){
                continue;
            }
            int count = 0;
            char lastChar ='0';
            for(int j = i + 1; j < n; j++){
                if(binary.charAt(j) == '0'){
                    count++;
                }
                else{
                    lastChar = '1';
                    break;
                }
            }
            if(lastChar == '1'){
                maxCount = Math.max(maxCount, count);
            }

        }
        return maxCount;
    }

    public static int binaryGap1(int number){
        String binary = Integer.toBinaryString(number);
        int n = binary.length();
        int count = 0;
        int maxCount = 0;
        boolean gapStarted = false;
        for(int i = 0; i < n; i++){
            if(binary.charAt(i) == '1'){
                maxCount = Math.max(count,maxCount);
                count = 0;
                gapStarted = true;
            }
            else{
                if(gapStarted){
                    count++;
                }
            }
        }
        return maxCount;
    }
}
