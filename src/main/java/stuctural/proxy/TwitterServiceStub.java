package stuctural.proxy;

public class TwitterServiceStub implements TwitterService {

    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    public void postToTimeline(String screenName, String message) {
    }
}
