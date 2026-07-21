package JavaFSE.DeepsKilling.Module5_Spring_Core_Maven.Java.Exercise08.aspect;

public class LoggingAspect {

    public void beforeMethod() {
        System.out.println("Before method execution");
    }

    public void afterMethod() {
        System.out.println("After method execution");
    }
}