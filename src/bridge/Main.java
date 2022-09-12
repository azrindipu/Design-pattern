package bridge;

import bridge.abstruction.LongView;
import bridge.abstruction.ShortView;
import bridge.abstruction.View;
import bridge.implementor.*;

public class Main {
    public static void main(String[] args){
        Resource artistResource = new ArtistResource(new Artist());
        Resource bookResource = new BookResource(new Book());
        View view = new LongView(artistResource);
        System.out.println(view.show());
        view.addResource(bookResource);
        System.out.println(view.show());

        view = new ShortView(artistResource);
        System.out.println(view.show());
        view.addResource(bookResource);
        System.out.println(view.show());

    }
}
