package Seminar_2;

import java.util.ArrayList;
import java.util.Arrays;

public class subsetFrom2Sets {
    static ArrayList<ArrayList<Integer>> createSubsets(int arr[]) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> arrSubsets = new ArrayList<ArrayList<Integer>>();
        // Run a loop for printing all 2^n subsets one by one
        for (int i = 0; i < (1 << n); i++) { // (1 << n) = 1 * 2^n,
            // Сдвигая биты числа X на N битов влево мы умножаем число X на 2^N
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                // (1<<j) is a number with jth bit 1 so when we 'and' them with the
                // subset number we get which numbers are present in the subset and which are not
                if ((i & (1 << j)) > 0) {
                    subset.add(arr[j]);
                }
            }
            arrSubsets.add(subset);
        }
        return arrSubsets;
    }

    public static ArrayList<ArrayList<Integer>> subsetsCommonCreate(ArrayList<ArrayList<Integer>> arrSubset1,
            ArrayList<ArrayList<Integer>> arrSubset2) {
        ArrayList<ArrayList<Integer>> listCommonSubsets = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> arrayList : arrSubset1) {
            if (arrSubset2.contains(arrayList)) {
                listCommonSubsets.add(arrayList);
            }
        }
        return listCommonSubsets;
    }

    public static ArrayList<Integer> getOneOfLongestSubsets(ArrayList<ArrayList<Integer>> arrCommons) {
        int i = 0;
        ArrayList<Integer> longestSubset = arrCommons.get(i);
        for (i = 1; i < arrCommons.size(); i++) {
            if ((arrCommons.get(i)).size() > (longestSubset).size()) {
                longestSubset = arrCommons.get(i);
            }
        }
        return longestSubset;
    }

    public static void main(String[] args) {
        int set1[] = { 1, 3, 3, 4, 1, 2, 3, 4 };
        int set2[] = { 1, 3, 4, 4, 1, 2, 3, 7, 8, 9 };

        String set1String = Arrays.toString(set1);
        String set2String = Arrays.toString(set2);

        System.out.println("The 1 list of sets:\n" + set1String);
        System.out.println("The 2 list of sets:\n" + set2String);
        ArrayList<ArrayList<Integer>> arrSubSet1 = createSubsets(set1);
        ArrayList<ArrayList<Integer>> arrSubSet2 = createSubsets(set2);
        // System.out.println("The 1 list of subsets:\n" + arr_subset1);
        // System.out.println("The 2 list of subsets:\n" + arr_subset2);
        ArrayList<ArrayList<Integer>> listCommonSubsets = subsetsCommonCreate(arrSubSet1, arrSubSet2);
        // System.out.println("The common subsets:\n" + listCommonSubsets);
        ArrayList<Integer> longestSubset = getOneOfLongestSubsets(listCommonSubsets);
        System.out.println("The longest subsets:\n" + longestSubset);
        int lengthOfLongestSubset = longestSubset.size();
        System.out.println("The longest subsets length:\n" + lengthOfLongestSubset);
    }
}
