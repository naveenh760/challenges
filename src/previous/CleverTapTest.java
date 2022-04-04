package previous;

public class CleverTapTest {

    public static double power(int a, int b){
        int answer = a;
        int i = 2;
        for(i = 1; i * 2 <= b; i = i * 2){
            answer = answer * answer;
        }
        if(i > b){
            i = i / 2;
            int remaining = b - i;
            for(int j = 1; j <= remaining; j++){
                answer = answer * b;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int  a = 3;
        int b = 4;
        System.out.println(power(a,b));
    }

}
