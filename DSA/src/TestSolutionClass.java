import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSolutionClass {


    @Test
    public void testNextGreaterElement(){
        int[] nums1 = {4,1,2}, 
              nums2 = {1,3,4,2},
              ans   = {-1,3,-1};
        NextGreaterElement ngt = new NextGreaterElement();
        assertArrayEquals(ans, ngt.nextGreaterElement(nums1, nums2));
    }

    @Test
    public void testBaseBallGame(){
        String[] operations = {"5","2","C","D","+"};
        BaseBallGame bbgGame = new BaseBallGame();
        assertEquals(30, bbgGame.calPoints(operations));
    }


}