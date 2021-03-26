import org.junit.Assert;
import org.junit.Test;

public class TestArray {
    @Test
    public void test1arrayLooking4() {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] out = new int[]{5, 6, 7, 8};

    }

    @Test(expected = RuntimeException.class)
    public void test2arrayLooking4() {
        int[] in = new int[]{1, 2, 3, 5, 6, 7, 8};
        Main.arrayLooking4(in);
    }

    @Test
    public void test1arrayFourOne() {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertFalse(Main.arrayFourOne(in));
    }

    @Test
    public void test2arrayFourOne() {
        int[] in = new int[]{1, 4, 1, 4};
        Assert.assertTrue(Main.arrayFourOne(in));
    }
    @Test
    public void testAdd(){
        Assert.assertEquals(5,Main.add(2,3));
    }
}
