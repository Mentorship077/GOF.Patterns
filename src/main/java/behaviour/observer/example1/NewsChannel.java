package behaviour.observer.example1;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public String getNews() {
        return news;
    }

    public NewsChannel setNews(String news) {
        this.news = news;
        return this;
    }
}
