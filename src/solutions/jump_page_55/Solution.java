package solutions.jump_page_55;

/**
 * - Dynamic programming
 * - Greedy algorithm
 */
class Solution {
    public boolean canJump(int[] nums) {
        // Indicates if index is reachable

        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            // Instead of taking single step we track the furthest reachable step.
            // Because previous indices are all reachable by taking single steps.
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}