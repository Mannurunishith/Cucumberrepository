package cucum100;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class database{

@Given("user in home page")
public void user_in_home_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("user enters credentials")
public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
  List<Map<String,String>> arun = dataTable.asMaps();
  for(int i=0;i<arun.size();i++) {
  System.out.println(arun.get(i).get("username"));
  System.out.println(arun.get(i).get("password"));

}
}
@When("Click on login button")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("Home page is displayed")
public void home_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
}

