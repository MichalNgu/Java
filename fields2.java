class fields2 {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};

        // Součet
        int sum = 0;
        for (int x = 0; x < ages.length; x++) {
            sum += ages[x];
        }
        System.out.println("Součet: " + sum);

        // Hledání největšího čísla
        int res = ages[0]; // začneme prvním prvkem v poli
        for (int y : ages) {
            if (res < y) {
                res = y;
            }
        }
        System.out.println("Největší číslo: " + res);
    }
}