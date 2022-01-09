package arraypractice;

import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public static int solution(int[][] arr)
{
    int N=arr.length;

    int M=arr[N-1].length;

    int[] row=new int[N];

    int[] col=new int[M];

    int x=0,y=0;

    int sumrow=0,colsum=0;

    int rowUS=0,rowLS=0,colLS=0,colRS=0;

    int a=0,b=0,count=0;

    for(int i=0;i<N;i++) {

    sumrow=0;

        for(int j=0;j<M;j++) {

            sumrow+=arr[i][j];

        }

    row[x++]=sumrow;

    }

    for(int i=0;i<M;i++) {

    colsum=0;

        for(int j=0;j<N;j++) {

        colsum+=arr[j][i];

        }

    col[y++]=colsum;

    }

//System.out.println(Arrays.toString(row));

//System.out.println(Arrays.toString(col));

    for(int i=0;i<N;i++)

    {

    a=0;

//System.out.println("i"+i);

    rowUS=0;

    while(a<i)

    rowUS+=row[a++];

//System.out.println("rowUS"+rowUS);

    a++;

//System.out.println("a"+a);

    rowLS=0;

    while(a<N)

    rowLS+=row[a++];

//System.out.println("rowLS"+rowLS);

//System.out.println("aLS"+a);

    if(rowUS==rowLS)

    {

    for(int j=0;j<M;j++)

    {

//System.out.println("j"+j);

    b=0;

    colLS=0;

    while(b<j)

    colLS+=col[b++];

//System.out.println("colLS"+colLS);

    b++;

    colRS=0;

    while(b<M)

    colRS+=col[b++];

//System.out.println("colRS"+colRS);

    if(colLS==colRS) {

//System.out.println("arr"+arr[i][j]);

    count++;

    }
    }
    }
    }
    return count;
    }
}

