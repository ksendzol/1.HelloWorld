/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/** @author Liudmila, ...*/

public class HelloWorldTests {
    @Test public void appHasAGreeting() {
        HelloWorld classUnderTest = new HelloWorld();
        assertEquals(classUnderTest.getGreeting(), "Hello World", "app should gave a greeting");
    }
}

