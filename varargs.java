
import java.lang.reflect.Array;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        shivaj("rahul",10,20,1,2,3,45,6,8,2,7,2,54);
        
    }
    static void shivaj(String a,int ...v){
        System.out.println(Arrays.toString(v));

    }
    
}
