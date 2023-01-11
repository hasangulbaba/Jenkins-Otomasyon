package test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JenkinsTest {

    int number =0;
    @Test
    public void givenNumber_whenEven_thenTrue() {
        number=4;
        assertTrue(number % 2 == 0);

    }
}
