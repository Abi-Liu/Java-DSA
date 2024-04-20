import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        int[] a = {0,1,2,2,3,4,5};
        int[] b = {2, 4};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num: b){
            map.put(num, true);
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num: a){
            if(!map.containsKey(num)){
                list.add(num);
            }
        }

        int[] newList = new int[list.size()];
        for(int i = 0; i < list.size(); i ++){
            newList[i] = list.get(i);
        }
        
        return newList;
  }
}
