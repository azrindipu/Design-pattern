package chain_of_responsibility;

import chain_of_responsibility.chain.Chain;
import chain_of_responsibility.utils.HandlerBuilder;
import chain_of_responsibility.utils.LoggerType;

public class Main {
    public static void main(String[] args){
        Chain logger = HandlerBuilder.build();
        logger.log(LoggerType.INFO.toString(), "Hi am I am INFO msg");
        logger.log(LoggerType.ERROR.toString(), "Hi am I am ERROR msg");
        logger.log(LoggerType.WARNING.toString(), "Hi am I am WARNING msg");
    }
}
