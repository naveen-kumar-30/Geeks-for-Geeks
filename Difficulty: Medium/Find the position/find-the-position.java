//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String n = read.readLine().trim();
            Solution ob = new Solution();
            long ans = ob.findpos(n);
            System.out.println(ans);
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long findpos(String n) 
    { 
        long res=0;
      for(int i=0;i<n.length();i++){
          if(n.charAt(i)=='4'){
              res = res*2+1;
          }
          else
            res= res*2+2;
      }
      return res;
    }
}