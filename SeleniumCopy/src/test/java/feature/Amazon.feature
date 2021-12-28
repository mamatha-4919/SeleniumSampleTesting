Scenario : Register to Amazonwebsite
  
    Given www.amazon.com site in Chrome Browser
    And then click on signIn page
    And click on create Account button
    Then enter the valid user details
    And click on Submit button
    
  Scenario: SignIn  to Amazonwebsite
    Given www.amazon.com site in Chrome Browser
  And click on signIn button
  Then enter the valid user credential
  And click the signIn button and user in home page
  
  When click on product search box enter the product 
  And click search button
  Then click the product whitch item  user likes
  And click on add to cart
 Then back to HomeLogout from amazon Website
  
