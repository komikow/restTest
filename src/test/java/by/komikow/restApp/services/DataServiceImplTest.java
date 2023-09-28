package by.komikow.restApp.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DataServiceImplTest {
    @Mock
    DataService dataServiceImpl;

    @Test
    void testGetCountChars() {
        String request = null;
        String result = dataServiceImpl.getCountChars(request);
        assertEquals(null, result);
    }
}