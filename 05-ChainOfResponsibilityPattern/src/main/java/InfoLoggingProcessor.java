public class InfoLoggingProcessor extends LoggingProcessor{

    public InfoLoggingProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    @Override
    public void log(LoggingType type, String message){
        if(type == LoggingType.INFO){
            System.out.println("INFO: " + message);
        }
        else {
            super.log(type, message);
        }
    }
}
