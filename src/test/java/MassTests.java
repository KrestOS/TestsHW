import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTests {
private int[] arrExp;
private int[] arr;
private int[] arr1and4;

    public MassTests(int[] arrExp, int[] arr, int[] arr1and4) {
        this.arrExp = arrExp;
        this.arr = arr;
        this.arr1and4 = arr1and4;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{7,7}, new int[]{1,2,4,5,7,4,7,7}, new int[]{1,1,1,4}},
                {new int[]{7}, new int[]{1,4,4,5,4,4,7}, new int[]{4,1,1,4}},
                {new int[]{}, new int[]{1,4}, new int[]{1,4,1,4}},
                {new int[]{6,5,3,1}, new int[]{1,4,6,5,3,1}, new int[]{4,4,4,1}},
        });
    }
    @Test
    public void testAfter4CutArr(){
        Assert.assertArrayEquals(arrExp,MainHW6.after4CutArr(arr));

    }


    @Test
    public void testCheck1and4Arr(){
        Assert.assertTrue(MainHW6.check1and4Arr(arr1and4));

    }
}
