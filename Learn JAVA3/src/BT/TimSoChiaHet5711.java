package BT;

public class TimSoChiaHet5711 {
        public static void main(String[] args) {
            int n = 1;
            boolean mach = false;
            while (!mach) {
                if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                    mach = true;
                    System.out.println("Số nguyên nhỏ nhất chia hết cho 5,7,11 là: " + n);
                }
                n++;
            }
        }
}


