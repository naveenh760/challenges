package previous;

public class ZoomCar {
    public static void main(String[] args){
        System.out.println("Hello");
        int ans = makeMove(3,7,0,0);
        System.out.println(ans);
    }

    public static int makeMove(int m, int n,int i, int j){
        if(i == m || j == n) {
            return 0;
        }
        if(i == m -1 && j == n - 1) {
            return 1;
        }
       return makeMove(m,n,i +1, j) + makeMove(m,n, i, j+ 1);

    }
}
