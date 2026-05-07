class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];
        
        for (int n : arr1)
            freq[n]++;

        int i = 0;

        for (int n : arr2)
            while (freq[n]-- > 0)
                arr1[i++] = n;

        for (int n = 0; n < 1001; n++)
            while (freq[n]-- > 0)
                arr1[i++] = n;

        return arr1;
    }
}