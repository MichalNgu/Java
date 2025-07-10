public class methods2 {
    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res;
    }
    public static void main(String[] args) {
        double x = perc(530, 23);
        System.out.println("Result is: "+x);
    }
}
