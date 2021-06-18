public class exercise_8 {
    public static void main(String[] args) {
        int flag = 2;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = 0;
                    break;
                }
                flag = 1;
            }
            if (flag == 1){
                System.out.println(i + " is prime.");
            }
        }    
    }
}
