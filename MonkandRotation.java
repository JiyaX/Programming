
import java.util.*;
import java.io.*; 

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t  = s.nextInt(); 
        for(int m=0;m<t;m++)
        { 
int n= s.nextInt(); 
int k=s.nextInt();

        
          
        int x;
        int u=0;

        int b[]= new int[n];

        for(int i=0;i<n;i++)
        {
            x= s.nextInt();

            if(i<n-k)
            {
           
            b[i+k]=x;

            }
            else if(i>=n-k)
            
            {
                if(u<k)
                {
                b[u]=x;
                u++;
                }}
        }
     
        
        for(int h=0;h<n;h++)
        {
        System.out.print(b[h]+" ");
        }
        System.out.print("\n");
        }
        }}
    
