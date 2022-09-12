package bridge.implementor;

public class ArtistResource implements Resource {
    private Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String getText() {
        return this.artist.getBio();
    }

    @Override
    public String getImage() {
        return this.artist.getImage();
    }

    @Override
    public String getTitle() {
        return this.artist.getTitle();
    }
}
