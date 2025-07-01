import java.util.HashMap;

public class Distinct_color_ball_3160 {

    public static int[] queryResults(int limit, int[][] queries) {
        // int max = (limit < queries.length) ? limit : queries.length;
        int[] ans = new int[queries.length];
        HashMap<Integer, Integer> table = new HashMap<>();
        int count = 0;
        for (int i = 0; i < queries.length; i++) {
            
            if ( table.containsValue(queries[i][1]) || table.containsKey(queries[i][0])  ) {
                table.put(queries[i][0], queries[i][1]);

            } else {
                table.put(queries[i][0], queries[i][1]);
                count++;
            }
            for (int key : table.keySet()) {
                
            }

            ans[i] = count;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] queries = { {0,1},{0,4},{1,2},{1,5},{1,4} };
        int[] ans = queryResults(4, queries);
        for (int i : ans) {
            System.out.print(i);
        }
    }
}
