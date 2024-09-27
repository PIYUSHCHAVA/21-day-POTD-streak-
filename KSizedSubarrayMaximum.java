import java.util.ArrayList;
import java.util.PriorityQueue;

class KSizedSubarrayMaximum {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        // Priority queue to store the elements in descending order (max heap)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{arr[i], i}); // Add element and its index to the priority queue

            // Remove elements that are outside the window of size k
            while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                pq.poll();
            }

            // Add the maximum of the current window to the result list
            if (i >= k - 1) {
                al.add(pq.peek()[0]);
            }
        }
        return al;
    }

    // Main method to test the max_of_subarrays function with direct values
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};

        // Create an object of Solution class and call the function
        KSizedSubarrayMaximum sol = new KSizedSubarrayMaximum();
        ArrayList<Integer> result = sol.max_of_subarrays(k, arr);

        // Output the result
        System.out.println("Maximum of each subarray of size " + k + ":");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
//2nd approach to solved
//Runtime error of this code TLE error.
/*  ArrayList<Integer> al=new ArrayList<>();
         int n=arr.length;
        for(int i=0; i<=arr.length - k ; i++)
        {
            int max=arr[i];
            for(int j=1; j<k; j++)
            {
                if(arr[i+j] > max)
                {
                    max=arr[i+j];
                }
            }
            al.add(max);
        }
        return al;
        */