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
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
  private static final int MOD = 1000000007;  // Large prime for modulo
    
    public int distinctSubsequences(String S) {
        int n = S.length();
        
        // dp[i] will store the number of distinct subsequences of S[0..i-1]
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: There is 1 subsequence for an empty string (the empty subsequence)

        // Map to store the last occurrence of each character
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            char currentChar = S.charAt(i - 1);

            // Double the number of subsequences (include or exclude the current character)
            dp[i] = (2 * dp[i - 1]) % MOD;

            // If the character was seen before, subtract the subsequences formed before its last occurrence
            if (lastOccurrence.containsKey(currentChar)) {
                int lastIdx = lastOccurrence.get(currentChar);
                dp[i] = (dp[i] - dp[lastIdx - 1] + MOD) % MOD;
            }

            // Update the last occurrence of the current character
            lastOccurrence.put(currentChar, i);
        }

        // Return dp[n] as we don't need to subtract 1 anymore to exclude the empty subsequence
        return dp[n];
    }
}