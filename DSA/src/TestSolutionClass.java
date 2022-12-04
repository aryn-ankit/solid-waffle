import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestSolutionClass {
    @Test
    public void testNextGreaterElement(){
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2}; 
        NextGreaterElement ngt = new NextGreaterElement();
        int[] ans = {-1,3,-1};
        assertArrayEquals(ans, ngt.nextGreaterElement(nums1, nums2));
    }
}