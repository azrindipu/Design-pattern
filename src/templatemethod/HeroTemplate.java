package templatemethod;

public class HeroTemplate extends Template {

    @Override
    void getImage() {
        System.out.println("getting the image from another source for hero poster");
    }

    @Override
    void getText() {
        System.out.println("getting the image from another source for hero poster");
    }
}
