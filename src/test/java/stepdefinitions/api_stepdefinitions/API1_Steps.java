package stepdefinitions.api_stepdefinitions;

import base_url_setup.AutomationExerciseBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class API1_Steps extends AutomationExerciseBaseUrl {

    Response response;
    Response responseLogin=null;

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://automationexercise.com/api").build();

    @Given("user connects to {string} for search product list")
    public void user_connects_to_for_search_product_list(String endUrl) {
        spec.pathParam("par1", endUrl);
    response = given().spec(requestSpecification).pathParam("/{first}",endUrl).when().get(endUrl);
       response.prettyPrint();

    }
    @Then("user verifies that status code is {int} for search product  lists")
    public void user_verifies_that_status_code_is_for_search_product_lists(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that response body has {int} products")
    public void user_verifies_that_response_body_has_products(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user write to product list into log.txt that is contained price less than {int}")
    public void user_write_to_product_list_into_log_txt_that_is_contained_price_less_than(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
