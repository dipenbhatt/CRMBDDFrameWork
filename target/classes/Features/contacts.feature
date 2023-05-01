Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

  Given User is already on login page
    When title of Login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user Clicks on Login button
    Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| dipenbhatt  | dipen@123 | Tom 	  | Peter    | Manager  |
	| dipenbhatt  | dipen@123 | David 	  | Dsouza   | Director |	