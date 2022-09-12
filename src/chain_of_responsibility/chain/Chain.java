package chain_of_responsibility.chain;

public interface Chain {
    void addNextChain(Chain chain);
    void log(String taskType, String msg);
}
