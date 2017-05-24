import java.util.*;

class Jump_Game {
	
	public boolean canJump(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > max) {
				return false;
			}
			max = Math.max(A[i] + i, max);
		}
		return true;
	}
}