package JavaFSE.DeepsKilling.Module4;

public class MyService {

    private Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void performAction() {
        logger.log("Action Performed");
    }
}