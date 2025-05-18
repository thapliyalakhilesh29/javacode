import java.util.HashSet;

public class DuplicateElement {
    public static void main (String[] arg){

int[] arr = {1, 3 ,4,5,2,1};

HashSet<Integer> set = new HashSet<>();

for( int i=0; i< arr.length; i++){
if (set.contains(arr[i])){
    System.out.println("");

}
else{
    set.add(arr[i]);
}

}
System.out.println(set);
}
}