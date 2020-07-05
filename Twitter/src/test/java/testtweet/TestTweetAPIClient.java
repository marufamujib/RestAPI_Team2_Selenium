package testtweet;
import org.testng.annotations.BeforeClass;
import tweet.TweetAPIClient;

public class TestTweetAPIClient {
    private TweetAPIClient tweetAPIClient;

    @BeforeClass
    public void setUpTweetAPI(){
        this.tweetAPIClient=new TweetAPIClient();
    }



}
