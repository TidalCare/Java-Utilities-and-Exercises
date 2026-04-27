package exercise.jumpGame;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {2,3,1,1,4};
		System.out.println(sol.canJump(nums));
	}
}

class Solution {
	public boolean canJump( int[] nums) {
		int reachable = 0;
		for (int i = 0; i<nums.length; i++) {
			if (i > reachable)
				return false;
			reachable = Math.max(reachable, i+nums[i]);
		}
		return true;
		
	}
}