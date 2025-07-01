import java.util.ArrayList;
import java.util.List;

public class Combination_sum_39 {
    public static void findCombination(int index, int target, int[] candidates, List<List<Integer>> ans,
            List<Integer> ds) {
        // Base case
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Kaam
        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            findCombination(index, target - candidates[index], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(index + 1, target , candidates, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {

    }
}
