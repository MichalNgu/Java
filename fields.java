import java.util.Arrays;

class fields {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 18;
        ages[2] = 25;
        System.out.println(ages[2]);

        String[ ] names = { "A", "B", "C", "D"};
        System.out.println(Arrays.toString(names));
    }
}