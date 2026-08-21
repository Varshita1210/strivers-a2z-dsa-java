class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            List<Integer> pair = new ArrayList<>();
            pair.add(nums[i]);
            pair.add(count);

            result.add(pair);
        }

        return result;
    }
}