

Feature: Automate User Registration Process

  @smoke
  Scenario:  Automate User Registration Process
    Given Open the URL
    And Click on sign in link
    When Enter your email address in Create and account section
    And Click on Create an Account button.
    And  Enter your Personal Information Address and Contact info 
    |fname|lname|add|cit|zip|mobb|alias|
    |anusha|reddy|2673,Montreal|Montreal|35555|657585858|anu|
    Then Click on Register button
    And Validate that user is created


@reg
 Scenario: Automate Product Search Functionality of an e-commerce website
       Given Open the URL
       And Move your cursor over Women's link.
       When Click on sub menu 'T-shirts'
       And Get Name/Text of the first product displayed on the page.
       And Now enter the same product name in the search bar present on top of page and click search button.
       Then Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.
       
       
       
 @e2e
 Scenario: Automate End to End Buy Order functionality.
  Given Open the URL
  And Click on sign in link
  And Login to the website
  And Move your cursor over Women's link.
  When Click on sub menu 'T-shirts'
  And 'More' button will be displayed, click on 'More' button.
  And Select quantity,size,colour and add to cart
  And Click 'Proceed to checkout' button.
  And Complete the buy order process till payment.
  And Make sure that Product is ordered.
  