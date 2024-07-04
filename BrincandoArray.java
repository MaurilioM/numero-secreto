import java.lang.reflect.Array;
import java.util.Arrays;

public class BrincandoArray {
    public static void main(String[] args) {
        int[] num = {2,23,7,12,56,1,0,27};
        //String[] chave = {"mae","doce","filha","clara","Velha"};
        Arrays.sort(num);

        for(int n:num){
            System.out.printf("%d | ",n);
        }
    }
}
