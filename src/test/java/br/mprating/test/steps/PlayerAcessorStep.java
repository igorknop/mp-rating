package br.mprating.test.steps;

import br.mprating.Player;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


/**
 *
 * @author igor
 */
public class PlayerAcessorStep {

    Player player = new Player();

    @Given("a player with rating value $rating and name $name")
    public void givenPlayerWithRatingValue(@Named("rating") int rating, @Named("name") String name) {
        player.setName(name);
        player.setRating(rating);
    }

    @When("change rating to $newrating")
    public void whenIChangeRatingTo(@Named("newrating") int newrating) {
        player.setRating(newrating);
    }

    @Then("the player rating should be equal to $rating")
    public void thenRatingShouldBe(@Named("rating") int rating) {
        if (rating != player.getRating()) {
            throw new RuntimeException("rating is " + player.getRating() + ", but should be " + rating);
        }
    }
}
