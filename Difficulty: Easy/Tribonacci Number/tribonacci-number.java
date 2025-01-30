//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.nthTribonacci(n);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int nthTribonacci(int n) {
        if(n==0 )
            return 0;
        if(n==1||n==2)
            return 1;
        
        int dp[] = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            
        }
        return dp[n];
    }
}
