Scenario: Create a new player object
Given a player
When player is created
Then his initial rating should be 1500

Scenario: Two equaly rated players
Given two players with rating 1500 and 1500
When the first player wins the match
Then the first rating should be 1516 and the second 1484

