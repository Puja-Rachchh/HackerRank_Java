import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
{
try
{
    long x  =   sc.nextLong();

    System.out.println(x+" can be fitted in:");

    // if one of the if blocks get executed then we will have ans
    // no need to check for each dataType again and again
    if(x>=-128 && x<=127)
    {
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
    }
    else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
    {
            System.out.println("* short");
            System.out.println("* int");
    }
    else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
    {
            System.out.println("* int");
    }

    // will always be long unless exception occurs in that it won't hit :)
    System.out.println("* long");

    //Complete the code
}
catch(Exception e)
{
 // it will always be long unless this exception hit
    System.out.println(sc.next()+" can't be fitted anywhere.");
}
    }
    }
}




