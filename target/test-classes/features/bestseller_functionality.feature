Feature: Amazon Bestseller verification

Scenario: Verify Amazon Bestseller Functionality  
Given I am in landing page
When I click on the bestseller menu
And I click on the Books menu
And I enter the seleced book
Then I click on the search icon
Then I click on the book
And I click on the add to cart
And I click on the proceed
Then I will verify the text