import java.util.*;

public class TheThiefProblem {
    public static void main(String args[]){
        Integer arr[]={8,10,2,50,80,20};
        int k=4;
        /*PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

        for(int x:arr){
            pq.add(x);
        }

        int res=0;
        for(int i=0;i<k;i++){
            res+=pq.remove();
        }*/

        

        Arrays.sort(arr,Collections.reverseOrder());

        int res=0;
        for(int i=0;i<k;i++){
            res+=arr[i];
        }


        System.out.print(res);

    }
}
