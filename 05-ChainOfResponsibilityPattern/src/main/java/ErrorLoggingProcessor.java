public class ErrorLoggingProcessor extends LoggingProcessor{
    public ErrorLoggingProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    @Override
    public void log(LoggingType type, String message){
        if(type == LoggingType.ERROR){
            System.out.println("ERROR: " + message);
        }
        else {
            super.log(type, message);
        }
    }
}
