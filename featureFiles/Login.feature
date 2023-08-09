Feature: As a registerd user I want to use login from so that I login to the system

  Scenario: Login with valid username and password
    Given User is in homepage
    When Clicks on signin button 
    Then User see the sing in page
    And enter user name 'sahasqa@gmail.com'
    And enter password 'abc1234'
    And click sign in button
    Then user redirected to the My Account Page
    
  Scenario: Login with invalid username and password
  Given User is in homepage
  When Clicks on signin button
  Then User see the sing in page
  And enter user name '125jk'
  And enter password '8lk8'
  And click sign in button
  Then user sees the error message
  
  

 
