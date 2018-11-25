package behaviour.observer.example1;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("example1");

        assert true : observer.getNews().equals("example1");
    }
}
