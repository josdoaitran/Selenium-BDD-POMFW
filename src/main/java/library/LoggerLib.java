package library;

import org.apache.log4j.Logger;

public class LoggerLib {
    private static Logger logger = Logger.getLogger("LOG");

    public static void printLogFrameworkSteps(String frameworkStep){
        logger.info("===== " + frameworkStep + " =====");
    }

    public static void printLogStepDefinitions(String stepDefinitions){
        logger.info("===== " + stepDefinitions + " =====");
    }

    public static void printLogActionInPage(String pageDescription){
        logger.info("----- " + pageDescription + " -----");
    }

    public static void printErrorLogActionInPage(String pageDescription){
        logger.error("----- " + pageDescription + " -----");
    }

    public static void printLogParameterInput(String parameterDescription, String parameterValue){
        logger.info("***** " + parameterDescription + ":" + parameterValue + " *****");
    }

    public static void printLogParameterGetProperties(String parameterDescription, String parameterValue){
        logger.info("##### " + parameterDescription + ":" + parameterValue + " #####");
    }

    public static void printLogParameterGetExcelFile(String parameterDescription, String parameterValue){
        logger.info("$$$$$ " + parameterDescription + ":" + parameterValue + " $$$$$");
    }

}
