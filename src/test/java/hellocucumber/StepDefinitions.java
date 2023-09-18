package hellocucumber;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void an_example_scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Then("the scenario passes")
    public void the_scenario_passes() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }
}
