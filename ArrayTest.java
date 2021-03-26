import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class ArrayTest {
    private int[] in;
    private int[] out;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{ 1,2,3, 4, 5,6, 7, 8}, new int[]{5,6, 7, 8}},
                {new int[]{ 1,2,3,4}, new int[]{}},
                {new int[]{1,2,3,4, 5, 6, 7, 8, 4}, new int[]{}},
                {new int[]{1,2,3,4, 5, 6, 7, 4, 8}, new int[]{8}}

        });
    }


    public ArrayTest(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Test
    public void massTestarrayLooking4() {
        Assert.assertArrayEquals(out, Main.arrayLooking4(in));
    }

}
