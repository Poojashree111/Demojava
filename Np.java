import java.util.*;
public class Np {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i,j,m=0,count=0;

 

        int N = sc.nextInt();
        int L[]= new int[N];
        int R[]= new int[N];
        int out[][]= new int[N][N];

 

        for(i=0;i<N;i++)
            L[i]=sc.nextInt();
        for(i=0;i<N;i++)
            R[i]=sc.nextInt();
        System.out.println("OUTPUT:");
        int min=L[0];
        int max=R[N-1];

 

        if(min!=0){
            out[m][0]=0;
            out[m][1]=L[0];
            m++;
        }

 

        for(i=0; i<N-1; i++)
        {
            if(R[i]<L[i+1] )
            {
                out[m][0]=R[i];
                out[m][1]=L[i+1];
                m++;
            }
        }
        if(max!=1000000000){
            out[m][0]=R[i];
            out[m][1]=1000000000;
            m++;
        }

 

        for(i=0;i<N;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(out[i][j]+" ");
            }
            System.out.println("");
        }

 

    }
}
 