package JavaFSE.DeepsKilling.Module4;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void execute() {
        api.processData();
    }
}