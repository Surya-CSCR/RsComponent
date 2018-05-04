@tag
Feature: Title of your feature

  @tag1
  Scenario: Product Checkout  of your scenario
    Given the user is in the mybasketpage
    When the "Checkout securily" button is enabled
    And the user selects the "Ckeckout_Button"
    Then the user should be navigated to alertpage
  @tag2
  Scenario: Title of your scenario outline
	   Given the user is in the alertpage
	   When the user enters the "<emailId>" in the "Email address"
	   And clicks on the GuestCheckOut button	
	   Then the user should be navigated to securecheckoutpage
