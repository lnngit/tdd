package tdd;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int ans = 0;
		for (int num : nums) {
			ans ^= num;
		}
		return ans;
	}

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] nums = new int[] { 0, 5, 6, 7, 5, 6, 7 };
		int res = sn.singleNumber(nums);
		System.out.println(res);
		
		
		
		System.out.println(-8>>>1);
	}

}
