//{ Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;



// } Driver Code Ends
//User function Template for C++


void volume(int s)
{
     std::cout<<(s*s*s)<<endl;

}

void volume(int r, int h)
{
    float pi=3.14159;
     std::cout<<(float)(pi*r*r*h)<<endl;

}

void volume(int l, int b, int h)
{
    std::cout<<(l*b*h)<<endl;

}



//{ Driver Code Starts.
int main() 
{
    int t;
    cin>>t;
    while(t--)
    {
        int q;
        cin>>q;
        
        switch (q)
        {
            case 1:
            int edge;
            cin>>edge;
            volume(edge);
            break;
            
            case 2:
            int radius, heigh;
            cin>>radius>>heigh;
            volume(radius, heigh);
            break;
            
            case 3:
            int length, width, height;
            cin>>length>>width>>height;
            volume(length, width, height);
            break;
            
        }
        
        
        
    
cout << "~" << "\n";
}
	
	return 0;
}
// } Driver Code Ends