public class ForTest {


    public static void main(String[] args) {

//        int i;
//        for (i = 0; i < 10; i++){
//            System.out.println("乞丐干了" + (i + 1) + "天~！");
//        }

        boolean breakout = false;
        for (int i = 1; i < 10; i++){

            for (int j = 1; j < 10; j++){
                System.out.println("i = " + i + ", j = " + j);

                if (j % 2 == 0){
                    breakout = true;
                    break;
                }
            }

            if (breakout){
                break;
            }
        }
    }
}
