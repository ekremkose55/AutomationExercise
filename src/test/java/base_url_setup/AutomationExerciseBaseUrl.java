package base_url_setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class AutomationExerciseBaseUrl {

    protected static RequestSpecification spec;

    public static void automationExerciseSetup(){
        spec = new RequestSpecBuilder().setBaseUri("https://automationexercise.com/api").build();

    }

}
