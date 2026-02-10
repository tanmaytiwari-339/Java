import java.util.Arrays;

public class linearbnsearch{
    public static void main(String[] args){
        int[][] a= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(lnsearch(a,37)));

    }
    static int[] lnsearch(int[][] a,int target){
        int r=0;
        int c=a.length-1;
        while(r<a.length && c>=0){
            if(a[r][c]==target){
                return new int[]{r,c};
            }
            if(a[r][c]<target){
                r++;
            }else{
                c--;

            }
        }
        return new int[]{-1,-1};
        
    }
}