package tweet;

import base.TwitterAPIClient;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TweetAPIClient extends TwitterAPIClient {
    // http://developer.twitter.com/en/docs/tweets/timelines
    // Tweet Client class that consists of all the different API's of the Twitter tweet
    // POST: Retrieve and engage with tweets....

    //https://api.twitter.com/1.1/statuses/update.json
    private final String CREATE_TWEET_ENDPOINT="/statuses/update.json";
    //https://api.twitter.com/1.1/statuses/destroy/:id.json
    private final String DELETE_TWEET_ENDPOINT="/statuses/destroy.json";
    // https://api.twitter.com/1.1/statuses/user_timeline.json
    private final String GET_USER_TWEET_ENDPOINT="/statuses/user_timeline.json";
    //https://api.twitter.com/1.1/statuses/home_timeline.json
    private final String GET_HOME_TWEET_ENDPOINT="/statuses/home_timeline.json";





}
