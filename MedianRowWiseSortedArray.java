import java.util.Arrays;

public class MedianRowWiseSortedArray {
    public static void main(String args[]) {
        int mx[][] = { { 1, 10, 20 },
                       { 15, 25, 35 },
                       { 5, 30, 40 } };

        int min=mx[0][0],max = mx[0][2];
        for(int i=0;i<3;i++){
            if(mx[i][0]<min)min=mx[i][0];
            if(mx[i][2]>max)max=mx[i][2];
        }
        int medpos=(3*3+1)/2;
        while(min<max){
            int mid = (min+max)/2,midpos=0;
            for(int i=0;i<3;i++){
                int pos = Arrays.binarySearch(mx[i],mid)+1;
                midpos+=Math.abs(pos);
            }
            if(midpos<medpos){
                min=mid+1;
            }
            else{
                max=mid;
            }
        }

        System.out.print(min);
    }
}
