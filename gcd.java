public class gcd {
    static int GCD(int n, int m) {
        while(m!=n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(GCD(35, 56));
    }
}

