package chain_of_responsibility.utils;

import chain_of_responsibility.chain.Chain;
import chain_of_responsibility.handler.ErrorLogger;
import chain_of_responsibility.handler.InfoLogger;
import chain_of_responsibility.handler.WarningLogger;

public class HandlerBuilder {
    public static Chain build(){
        Chain info = new InfoLogger();
        Chain error = new ErrorLogger();
        Chain warning = new WarningLogger();
        info.addNextChain(error);
        error.addNextChain(warning);
        return info;
    }
}
