public class Triangle_empty_Jaruzaeva {
    /**
     * Triangle empty
     * Прямокутник пустий
     * *********
     * *-------*
     * *********
     */
    public static void main(String[] args) {

        int height = 0, width = 0;


        System.out.print("\n");
        System.out.println("Triangle empty");

        height = 6;
        width = 11;

        for (int і = 1; і <= width; і++) {
            System.out.print("* ");
        }
        for (int i = 0; i < height - 2; i++) {
            System.out.print("\n" + "*");
            for (int і = 1; і < +width * 2 - 2; і++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.print("\n");

        for (int і = 1; і <= width; і++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}

