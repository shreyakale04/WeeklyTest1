package practice;

import java.util.*;

public class CombinationSum {

	    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

	        List<List<Integer>> result = new ArrayList<>();

	        backtrack(candidates, target, 0, new ArrayList<>(), result);

	        return result;
	    }

	    public static void backtrack(
	            int[] candidates,
	            int target,
	            int index,
	            List<Integer> current,
	            List<List<Integer>> result) {

	        // Target reached
	        if (target == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        // Try all candidates
	        for (int i = index; i < candidates.length; i++) {

	            // If number is bigger than target, skip it
	            if (candidates[i] > target) {
	                continue;
	            }

	            // Choose
	            current.add(candidates[i]);

	            // Explore
	            backtrack(
	                    candidates,
	                    target - candidates[i],
	                    i,
	                    current,
	                    result
	            );

	            // Undo
	            current.remove(current.size() - 1);
	        }
	    }

	    public static void main(String[] args) {

	        int[] candidates = {2, 3, 6, 7};
	        int target = 7;

	        List<List<Integer>> result =
	                combinationSum(candidates, target);

	        System.out.println(result);
	    }
	

}
