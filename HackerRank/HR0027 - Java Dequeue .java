    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            
            HashMap<Integer,Integer> hash = new HashMap<>();

            int n = in.nextInt();
            int m = in.nextInt();
            
            int max = 0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               
                deque.add(num);
                hash.put(num,hash.getOrDefault(num, 0)+1);
                if(deque.size()==m){
                    max = Math.max(max, hash.size());
                }
                if(i>=m-1){
                    int removeF =(int)deque.removeFirst();
                    hash.put(removeF, hash.get(removeF)-1);
                    if(hash.get(removeF)==0)
                            hash.remove(removeF);
                    
                }
               
            }
            System.out.println(max);
        }
    }
