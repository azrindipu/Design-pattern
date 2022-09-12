package bridge.abstruction;

import bridge.implementor.Resource;

public class ShortView implements View {
    private Resource resource;

    public ShortView(Resource resource) {
        this.addResource(resource);
    }

    @Override
    public void addResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String show() {
        return "SHORT VIEW: "+this.resource.getTitle()+this.resource.getImage()+this.resource.getText();
    }
}
