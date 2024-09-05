//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    string isKrishnamurthy(int N) {
         int g=N;
         int c=0;
        while(N>0){
        int r=N%10;
         c=c+factorial(r);
        N=N/10;
        }
        if(c==g) return "YES";
        else return "NO";
    }
    
    int factorial(int n){
        int res=1;
        while(n>1){
            res=res*n;
            n--;
        }
        return res;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;

        Solution ob;
        cout << ob.isKrishnamurthy(N) << endl;
    }
    return 0;
}
// } Driver Code Ends