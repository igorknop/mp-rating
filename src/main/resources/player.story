Scenario: Create a new player object
Given a player with rating value 1500 and name Player1
When change rating to 1600
Then the player rating should be equal to 1600

Scenario: Two equaly rated players
Given two players with rating 1500 and 1500
When the first player wins the match
Then the first rating should be 1516 and the second 1484

