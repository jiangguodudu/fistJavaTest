public class SelectSort {

    public static void main(String[] args) {

        int[] a = {18,62,68,82,65,9};

        // 排序前
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        // 排序
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

        System.out.println();
        // 排序后
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        // 增强型for循环
        for (int each : a){
            System.out.println(each);
        }

    }
}
