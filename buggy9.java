public class Buggy7 {
    int[] data = new int[6];

    public void fillData() {
        for (int i = 0; i <= data.length; i++) { // Bug: off-by-one
            data[i] = i * 10;
        }
    }

    public int findMax() {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max)
                max = data[i];
        }
        return max;
    }

    public void displayData() {
        for (int i = 0; i <= data.length; i++) { // Bug: off-by-one
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Buggy7 obj = new Buggy7();
        obj.fillData();
        obj.displayData();

        int maxVal = obj.findMax();
        System.out.println("Maximum value: " + maxVal);

        // Bug: calling instance method on null object
        Buggy7 b2 = null;
        b2.displayData();
    }
}