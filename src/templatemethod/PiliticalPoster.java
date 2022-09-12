package templatemethod;

public class PiliticalPoster extends Template {
    @Override
    void getImage() {
        System.out.println("getting the image from another source for political poster");
    }

    @Override
    void getText() {
        System.out.println("getting the image from another source for political poster");
    }
}
