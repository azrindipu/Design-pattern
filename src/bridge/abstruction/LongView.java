package bridge.abstruction;

import bridge.implementor.Resource;

public class LongView implements View {
    private Resource resource;

    public LongView(Resource resource) {
        this.addResource(resource);
    }

    @Override
    public void addResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String show() {
        return "LONG VIEW: "+this.resource.getTitle()+this.resource.getImage()+this.resource.getText();
    }
}
