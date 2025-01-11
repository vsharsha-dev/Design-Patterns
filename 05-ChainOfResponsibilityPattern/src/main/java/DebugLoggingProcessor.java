public class DebugLoggingProcessor extends LoggingProcessor{
    public DebugLoggingProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    @Override
    public void log(LoggingType type, String message){
        if(type == LoggingType.DEBUG){
            System.out.println("DEBUG: " + message);
        }
        else {
            super.log(type, message);
        }
    }
}
