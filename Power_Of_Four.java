import java.math.*;

class Power_Of_Four {
	
	public boolean isPowerOfFour(int num) {
		if (num == 0)
			return false;
		if (num == 1)
			return true;
		if ((Long.parseLong("10101010101010101010101010101011", 2) & (long)num) != 0) {
			return false;
		}
		Long modal = Long.parseLong("01010101010101010101010101010100", 2);
		String result = Long.toBinaryString(modal & (long)num);
		int count = 0;
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == '1') {
				count++;
				if (count == 2)
					return false;
			}
		}
		if (count == 0)
			return false;
		return true;
	}
}