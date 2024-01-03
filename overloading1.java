public class overloading1 {
    static int area(int l, int b){
        int a = l*b;
        return a;
    }
    static double area(double r){
        double a = Math.PI * r * r;
        return a;
    }
    static double area(double a, double b, double h){
        double ar = ((a+b)* h)/2;
    return ar;
    }

    public static void main(String[] args) {
        System.out.println(area(12,3));
        System.out.println(area(2));
        System.out.println(area(2,3,5));
    }


}
