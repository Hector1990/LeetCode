import java.util.*;

class Next_Greater_Element_III {
	public static void main(String[] args) {
		Next_Greater_Element_III n = new Next_Greater_Element_III();
		System.out.println(n.nextGreaterElement(523333));
	}
	
	public int nextGreaterElement(int n) {
		char[] a = (String.valueOf(n)).toCharArray();
		int len = a.length;
		int i = 0;
		for (i = len - 1; i > 0; i--) {
			if (a[i - 1] < a[i]) {
				break;
			}
		}
		if (i == 0) {
			return -1;
		}
		char temp = a[i - 1];
		int min = i;
		for (int j = i + 1; j < len; j++) {
			if (a[j] > temp && a[j] <= a[min]) {
				min = j;
			}
		}
		char t = a[i - 1];
		a[i - 1] = a[min];
		a[min] = t;
		Arrays.sort(a, i, len);
		long r = Long.parseLong(String.valueOf(a));
		return r > Integer.MAX_VALUE ? -1 : (int)r;
	}
}