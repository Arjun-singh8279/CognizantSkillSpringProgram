package JavaFSE.DeepsKilling.Module4;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ArgumentMatchingTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData("Hello");

        verify(mockApi).getData(anyString());
    }
}