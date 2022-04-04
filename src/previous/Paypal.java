package previous;

import java.io.*;
import java.util.*;


public class Paypal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for(int i_task = 0; i_task < n; i_task++)
        {
            String[] arr_task = br.readLine().split(" ");
            for(int j_task = 0; j_task < arr_task.length; j_task++)
            {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }

        int out_ = solve(n, t, task);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int solve(int n, int t, int[][] task){
        Comparator<int[]> comparator = (a, b) -> a[1] - b[1];
        Arrays.sort(task, comparator);
        int count = 0;
        int currentPos = 0;
        for(int i = 0; i < n; i++){
            int timeTaken = (task[i][0] - currentPos) + task[i][1];
            int remainingTime = t - timeTaken;
            if(remainingTime >= currentPos){
                count++;
                currentPos = task[i][0];
                t = remainingTime;
            }
            else{
                break;
            }
        }
        return count;

    }
}
