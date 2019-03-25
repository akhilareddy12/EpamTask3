import java.util.*;
public class RodCutting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int cnt;
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {   cnt=-1;
            int n=sc.nextInt();
         n=n+1;
            while(n>1)
            {   cnt++;
              // n=(int)Math.ceil(((double)n)/2);}
               n=n/2;
            }
            System.out.println(cnt);
        }
 


	}

}
