package bridge.abstruction;

import bridge.implementor.Resource;

public interface View {
    void addResource(Resource resource);
    String show();
}
