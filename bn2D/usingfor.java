import java.util.Arrays;
public class usingfor {
    public static void main(String[] args) {
        int[][] a= {
            {78,20,30,40},
            {15,20,35,78},
            {28,15,47,49},
            {33,34,38,0}
        };
        System.out.println(Arrays.toString(forsearch(a,15)));
    }
    static int[] forsearch(int[][] arr,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
