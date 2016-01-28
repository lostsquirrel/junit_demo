/**
 * 
 */
package test.junit.param;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author lisong
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTestFields {

	// fields used together with @Parameter must be public
    @Parameter
    public int m1;
    @Parameter (value = 1)
    public int m2;
    @Parameter (value = 2)
    public int result;
    


    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
        	{ 1 , 2, 2 }, 
        	{ 5, 3, 15 }, 
        	{ 121, 4, 484} 
        };
        return Arrays.asList(data);
    }


    @Test
    public void testMultiplyException() {
        MyClass tester = new MyClass();
        assertEquals("Result", result, tester.multiply(m1, m2));
    }


    // class to be tested
    class MyClass {
        public int multiply(int i, int j) {
            return i *j;
        }
    }
}
