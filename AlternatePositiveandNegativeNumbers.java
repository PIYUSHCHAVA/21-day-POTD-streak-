import java.util.ArrayList;

public class AlternatePositiveandNegativeNumbers {

    // Method to rearrange numbers
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
        // Store all positive and negative numbers separately
        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0)
                al1.add(arr.get(i));
            else
                al2.add(arr.get(i));
        }

        // Store alternating positive and negative numbers
        ArrayList<Integer> a = new ArrayList<>();
        int p = al1.size();
        int q = al2.size();
        int j = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (j < p) {
                a.add(al1.get(j));
                j++;
            }
            if (k < q) {
                a.add(al2.get(k));
                k++;
            }
        }

        // Change original array list elements
        for (int i = 0; i < n; i++) {
            arr.set(i, a.get(i));
        }
    }

    // Main method
    public static void main(String[] args) {
        AlternatePositiveandNegativeNumbers obj = new AlternatePositiveandNegativeNumbers();

        // Example input array list
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(4);
        arr.add(-2);
        arr.add(-1);
        arr.add(5);
        arr.add(0);
        arr.add(-5);
        arr.add(-3);
        arr.add(2);

        System.out.println("Original Array: " + arr);

        // Call the rearrange method
        obj.rearrange(arr);

        // Print the rearranged array
        System.out.println("Rearranged Array: " + arr);
    }
}
