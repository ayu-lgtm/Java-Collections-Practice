import java.util.*;

class Point{
    int x;
    int y;
    Point(int val,int s){
        x=val;
        y=s;
    }
}

class Mycmp implements Comparator<Point>{

    public int compare(Point p1,Point p2){
        return p2.y-p1.y;
    }
}

public class SortStudentByMarks {
    public static void main(String args[]){
        int roll[]={101,108,103,105};
        int marks[]={70,80,40,90};

        List<Point> l = new ArrayList<>();

        for(int i=0;i<roll.length;i++){
            l.add(new Point(roll[i],marks[i]));
        }

        Collections.sort(l,new Mycmp());

        for(Point x:l){
            System.out.println(x.x+" "+x.y);
        }

    }
}
