package com.theironyard;

import net.doughughes.testifier.exception.CannotAccessMethodException;
import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.exception.CannotInvokeMethodException;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@RunWith(JUnitParamsRunner.class)
public class StringKatasTest extends TestifierTest {

    @Test
    @Parameters
    public void testHelloName(String name, String expected) {
        /* arrange */

        /* act */
        String result = null;
        try {
            result = (String) Invoker.invokeStatic(StringKatas.class, "helloName", name);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Expected helloName(\"" + name + "\") → " + expected,
                result, equalTo(expected));
    }

    private Object[] parametersForTestHelloName() {
        return new Object[]{
                new String[]{"Bob", "Hello Bob!"},
                new String[]{"Alice", "Hello Alice!"},
                new String[]{"X", "Hello X!"},
                new String[]{"Dolly", "Hello Dolly!"},
                new String[]{"Alpha", "Hello Alpha!"},
                new String[]{"Omega", "Hello Omega!"},
                new String[]{"Goodbye", "Hello Goodbye!"},
                new String[]{"ho ho ho", "Hello ho ho ho!"},
                new String[]{"xyz!", "Hello xyz!!"},
                new String[]{"Hello", "Hello Hello!"}
        };
    }

    @Test
    @Parameters
    public void testMakeOutWord(String out, String word, String expected) {
        /* arrange */

        /* act */
        String result = null;
        try {
            result = (String) Invoker.invokeStatic(StringKatas.class, "makeOutWord", out, word);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Expected makeOutWord(\"" + out + "\", \"" + word + "\") → " + expected,
                result, equalTo(expected));
    }

    private Object[] parametersForTestMakeOutWord() {
        return new Object[]{
                new String[]{"<<>>", "Yay", "<<Yay>>"},
                new String[]{"<<>>", "WooHoo", "<<WooHoo>>"},
                new String[]{"[[]]", "word", "[[word]]"},
                new String[]{"HHoo", "Hello", "HHHellooo"},
                new String[]{"abyz", "YAY","abYAYyz"}
        };
    }

    @Test
    @Parameters
    public void testFirstHalf(String str, String expected) {
        /* arrange */

        /* act */
        String result = null;
        try {
            result = (String) Invoker.invokeStatic(StringKatas.class, "firstHalf", str);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Expected firstHalf(\"" + str + "\") → " + expected,
                result, equalTo(expected));
    }

    private Object[] parametersForTestFirstHalf() {
        return new Object[]{
                new String[]{"WooHoo", "Woo"},
                new String[]{"HelloThere", "Hello"},
                new String[]{"abcdef", "abc"},
                new String[]{"ab", "a"},
                new String[]{"", ""}
        };
    }


    @Test
    @Parameters
    public void testNTwice(String str, int n, String expected) {
        /* arrange */

        /* act */
        String result = null;
        try {
            result = (String) Invoker.invokeStatic(StringKatas.class, "nTwice", str, n);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Expected nTwice(\"" + str + "\", \"" + n + "\") → " + expected,
                result, equalTo(expected));
    }

    private Object[] parametersForTestNTwice() {
        return new Object[]{
                new Object[]{"Hello", 2, "Helo"},
                new Object[]{"Chocolate", 3, "Choate"},
                new Object[]{"Chocolate", 1, "Ce"},
                new Object[]{"Chocolate", 0, ""},
                new Object[]{"Hello", 4, "Hellello"},
                new Object[]{"Code", 4, "CodeCode"},
                new Object[]{"Code", 2, "Code"}
        };
    }



}