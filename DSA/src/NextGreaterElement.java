import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NextGreaterElement {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		Map<Integer,Integer> map = ngt(nums2);

		for(int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				ans[i] = map.get(nums1[i]);
			} else {
				ans[i] = -1;
			}
		}
		return ans;
	}

	private Map<Integer, Integer> ngt(int[] nums) {
		int n = nums.length;
		Stack<Integer> stack = new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i<n ;i++) {
			while (!stack.empty() && nums[i] > stack.peek()) {
				map.put(stack.pop(), nums[i]);
			}		
			stack.push(nums[i]);
		}

		return map;
	}
}