import java.util.Arrays;

public class ArrTest {

    public static void main(String[] args) {

//        int[] a;
//        a = new int[5];
//
//        int[] b = new int[5];
//
//        for (int i = 0; i < a.length; i++){
//            a[i] = (int) (Math.random() * 100);
//            System.out.println(a[i]);
//        }

        int[] a = {18,62,68,82,65,9};
        int[] b = new int[3];

        System.arraycopy(a, 0, b, 0, 3);

        for (int j = 0; j < b.length; j++){
            System.out.println(b[j]);
        }

        int[] c = Arrays.copyOfRange(a, 0, 3);
        System.out.println(Arrays.toString(c));
    }
}
