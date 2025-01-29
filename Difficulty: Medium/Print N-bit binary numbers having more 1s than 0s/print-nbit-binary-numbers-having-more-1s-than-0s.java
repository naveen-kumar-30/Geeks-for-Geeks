//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans = new ArrayList<>();
        helper(N,0,0,"",ans);
        return ans;
    }
    
  public void helper(int N,int ones,int zeros,String curr,List<String> ans){

        if(N==0)
        {
            if(ones>=zeros)
            {
                ans.add(curr);
            }
            return;
        }
        
        helper(N-1,ones+1,zeros,curr+"1",ans);
       if(ones>zeros)
        helper(N-1,ones,zeros+1,curr+"0",ans);
    }
}