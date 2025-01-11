public class CorPattern {
    public static void main(String[] args){
        LoggingProcessor logger = new InfoLoggingProcessor(new ErrorLoggingProcessor(new DebugLoggingProcessor(null)));

//        logger.log(LoggingType.ERROR, "Exception occurred");
        logger.log(LoggingType.DEBUG, "Need to debug this feature");
//        logger.log(LoggingType.INFO, "INFO regarding the function");
    }
}
