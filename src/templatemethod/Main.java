package templatemethod;

public class Main {
    public static void main(String[] args){
        Template heroPoster = new HeroTemplate();
        Template politicalPoster = new PiliticalPoster();
        heroPoster.template("Hero");
        politicalPoster.template("Political");
    }
}
