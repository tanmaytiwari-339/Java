

public class minimumIn2D {
    public static void main(String[] args) {
        // [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
        int[][] matrix={
            {1,0,0},
            {0,0,1},
            {1,1,1}
        };
        System.out.println(search(matrix));

    }
    static int search(int[][] matrix){
        int rows= matrix.length;
        int cols=matrix[0].length;
        int max=0;
        int index=0;
        for(int r=0;r<rows;r++){
            int count=0;
            for(int c=0;c<cols;c++){
                if(matrix[r][c]==1){
                count=count+1;
                }
            }
            if(count>max){
                max=count;
                index=r;
            }
        }
        if(max>0){
            return index;
        }else{
            return -1;
        }
        
    }
}
