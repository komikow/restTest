package by.komikow.restApp.utils;

//import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc(printOnlyOnFailure = false)
class UtilsTest {
    Utils utils = new Utils();

    @Test
    void getStringFromMap() {
        String message = "hello";
        String expectedString = "{l=2, e=1, h=1, o=1}";
        String result = utils.getCharsMap(message);
        assertEquals(expectedString, result);
    }
}