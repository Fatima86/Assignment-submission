Feature: Test etsy.com

  Scenario: Test to search for a product from the drop-down menu
    Given John is viewing the Etsy landing page 
    When he searches for a product from the drop-down menu
    Then the result jewellery page through dropdown should be displayed

  Scenario: Test to search for an product Icon
    Given John is viewing the Etsy landing page 
    When he searches for a product icon
    Then the result jewellery page through Icon should be displayed

   
     
     
