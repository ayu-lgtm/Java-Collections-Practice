import java.util.*;

class Point{
    int x;
    int  y;
    Point(int val,int s){
        x=val;
        y=s;
    }
}

class Mycmp implements Comparator<Point>{

    public int compare(Point p1,Point p2){
        return p1.x-p2.x;
    }
}

public class SortElementByFrequency {
    public static void main(String args[]){
        int arr[]={10,5,20,5,10,10,30};

        List<List<Integer>> al = new ArrayList<>();

        HashMap<Integer,Integer> hm = new HashMap<>();


        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(int i=0;i<=arr.length;i++){
            al.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer>e :hm.entrySet()){
            al.get(e.getValue()).add(e.getKey());
        }

        
        int index=0;
        for(int i=arr.length;i>=0;i--){
            for(int x:al.get(i)){
                for(int k=0;k<i;k++){
                    arr[index++]=x;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
