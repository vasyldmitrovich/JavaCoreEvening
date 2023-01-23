package com.softserve.Tasks.T12;

public class NaturalNumbers {
    public static void main(String[] args)
    {
        int i,sum=0;
        for ( i = 3; i <1000; i++)
        {
            if ((i % 3 == 0)||(i%5==0) )
                sum=sum+i;
        }
        System.out.print(sum);
    }

}
