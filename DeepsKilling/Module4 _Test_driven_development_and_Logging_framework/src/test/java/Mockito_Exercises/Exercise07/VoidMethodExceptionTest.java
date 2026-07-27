package JavaFSE.DeepsKilling.Module4;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class VoidMethodExceptionTest {

    @Test(expected = RuntimeException.class)
    public void testVoidMethodThrowsException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .processData();

        MyService service = new MyService(mockApi);

        service.execute();
    }
}