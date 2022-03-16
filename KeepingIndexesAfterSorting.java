import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class point{
    int i,j;
    point(int l,int m){
        i=l;
        j=m;
    }

    
}
class Mycmp implements Comparator<point>{
    public int compare(point p1,point p2){
        return p1.i-p2.i;   
    }
}

public class KeepingIndexesAfterSorting {
    public static void main(String args[]){
        int arr[]={20,40,30,10};

        ArrayList<point> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            al.add(new point(arr[i],i));
        }

        Collections.sort(al,new Mycmp());

        for(point x:al){
            System.out.println(x.i+" "+x.j+" ");
        }


    }
}
