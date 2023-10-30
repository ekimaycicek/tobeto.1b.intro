package workshop.workshop03.core.logging;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi "+ data);
    }
}