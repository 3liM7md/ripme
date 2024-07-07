package com.rarchives.ripme.tst;

import com.rarchives.ripme.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }

    public void testHandleArguments() {
        App app = new App();
        String[] args = {"--option1", "arg1", "--option2", "arg2"};
        app.handleArguments(args);

        assertEquals(2, app.options.size());
        assertEquals(2, app.args.size());
        assertTrue(app.options.contains("--option1"));
        assertTrue(app.args.contains("arg1"));
    }

}
