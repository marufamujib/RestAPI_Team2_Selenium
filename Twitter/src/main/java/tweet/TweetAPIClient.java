package tweet;

import base.TwitterAPIClient;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TweetAPIClient extends TwitterAPIClient {

    private final String CREATE_TWEET_ENDPOINT="/statuses/update.json";
    private final String DELETE_TWEET_ENDPOINT="/statuses/destroy.json";
    private final String GET_USER_TWEET_ENDPOINT="/statuses/user_timeline.json";
    private final String GET_HOME_TWEET_ENDPOINT="/statuses/home_timeline.json";





}
