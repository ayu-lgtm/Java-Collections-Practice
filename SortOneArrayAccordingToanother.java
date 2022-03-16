import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point{
    int x;
    String y;
    Point(int val,String s){
        x=val;
        y=s;
    }
}

class Mycmp implements Comparator<Point>{

    public int compare(Point p1,Point p2){
        return p1.x-p2.x;
    }
}

public class SortOneArrayAccordingToanother {
    public static void main(String args[]){
        int arr[]={4,2,3,1};
        String brr[]={"Saarthak","Uma","Ayush","Naval"};

        ArrayList<Point> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            al.add(new Point(arr[i],brr[i]));
        }

        Collections.sort(al,new Mycmp());

        for(Point x:al){
            System.out.println(x.x+" "+x.y);
        }
    }
}
