public abstract class LoggingProcessor {
    LoggingProcessor nextLoggingProcessor;

    public LoggingProcessor(LoggingProcessor nextLoggingProcessor){
        this.nextLoggingProcessor = nextLoggingProcessor;
    }

    public void log(LoggingType type, String message){
        if (nextLoggingProcessor != null){
            nextLoggingProcessor.log(type, message);
        }
    }
}
