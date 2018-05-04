Feature: Quick order feature

   Scenario: Quick order using the Quick order form
   
  	Given the user is in the homepage
    When the user enters the RsStockId in the RsStockNo quantity in the Quantity_Box
    And clicks on the AddtoBasket button	
    Then the user should be navigated to mybasketpage