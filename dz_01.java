import java.util.Random;

public class dz_01 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println(i);
        String g = Integer.toBinaryString(i);
        System.out.println(g);
        int [] m1 = new int[i/2];
        int f = i;
        if(i % 2 != 0) {
            i += 1;
            while (i <= Short.MAX_VALUE) {
                int index = 0;
                m1[index] = i;
                i += 2;
                System.out.print(m1[index] + " ");
                index += 1;
            }

        }
        else {
            while (i <= Short.MAX_VALUE) {
                int index = 0;
                m1[index] = i;
                i += 2;
                System.out.print(m1[index] + " "); 
                index += 1;
            }      
        }
        System.out.println();
        int [] m2 = new int[i/2];
        int min = Short.MIN_VALUE + 1;
        while (min <= f) {
            int index = 0;
            m2[index] = min;
            System.out.print(m2[index]);
            min += 2;
            index += 1;  
        }
    }
}