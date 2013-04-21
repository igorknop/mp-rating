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
public class PlayerRatingStep {

    Player player1;
    Player player2;

    @Given("two players with rating $rating1 and $rating2")
    public void givenPlayerWithRatingValue(@Named("rating1") int rating1, @Named("rating2") int rating2) {
        player1.setRating(rating1);
        player1.setRating(rating2);
    }

    @When(" the first player wins the match")
    public void whenIChangeRatingTo(@Named("newrating") int newrating) {
        player1.winFrom(player2);
    }

    @Then("the first rating should be $rating1 and the second $rating2")
    public void thenRatingShouldBe(@Named("rating1") int rating1, @Named("rating2") int rating2) {
        if (rating1 != player1.getRating()) {
            throw new RuntimeException("rating is " + player1.getRating() + ", but should be " + rating1);
        }
        if (rating2 != player2.getRating()) {
            throw new RuntimeException("rating is " + player2.getRating() + ", but should be " + rating2);
        }
    }
}
