import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double x=0;
            for(int j=0;j<n;j++){
                for(int k=0;k<j+1;k++){
                   x+=b*Math.pow(2,k);
                   
                }
                System.out.print((int)x+a+" "); 
                x=0;
            }
            System.out.println();
        }
        in.close();
    }
}
