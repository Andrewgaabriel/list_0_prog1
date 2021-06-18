public class exercise_5 {
    public static void main(String[] args) {
        
        System.out.println("Java atrapalha muita gente");

        for (int i=2; i<102; i++) {
            String result = new String(new char[i]).replace("\0", "atrapalham ");
            System.out.print("Java " + result);
            System.out.println("muita gente");
        }
    }
}
