package chain_of_responsibility.handler;

import chain_of_responsibility.chain.Chain;
import chain_of_responsibility.utils.LoggerType;

public class InfoLogger implements Chain {

    private Chain chain;

    @Override
    public void addNextChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void log(String taskType, String msg) {
        if(taskType.equalsIgnoreCase(LoggerType.INFO.toString())){
            System.out.println("INFO:: "+msg);
        }else{
            this.chain.log(taskType, msg);
        }
    }
}
