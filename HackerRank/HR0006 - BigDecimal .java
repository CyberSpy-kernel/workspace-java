import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        
        class ConnectedPair implements Comparable<ConnectedPair>{
            BigDecimal num;
            int pos;
            ConnectedPair(String num, int pos){
                this.num = new BigDecimal(num);
                this.pos = pos;
            }
            @Override
            public int compareTo(ConnectedPair pair) {
                return this.num.compareTo(pair.num);
            }
        }
        ConnectedPair[] pairArray = new ConnectedPair[n];
        // initializing the pairArray
        for(int i=0;i<n;i++){
            pairArray[i] = new ConnectedPair(s[i],i);
        }
        // ordered descending
        Arrays.sort(pairArray, Collections.reverseOrder());
        String[] refCopy = Arrays.copyOf(s, n);
    
        for(int i=0;i<n;i++){
            s[i] = refCopy[pairArray[i].pos];
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
