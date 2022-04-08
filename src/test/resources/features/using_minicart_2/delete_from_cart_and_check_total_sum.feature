Feature: Delete one product from cart and check total sum

  After deleting one product from cart from minicart, at checkout or on the payment page, the customer should see that
  the total sum is
  correct.

  Scenario: Delete product and check sum in minicart

    Given that Deborah has three products in cart
    When she deletes one of the products in minicart
    Then she should see correct total sum

    Scenario: Delete product and check sum on checkout page

      Given that Deborah has three products in cart
      And she has three products at checkout
      When she deletes one of the products at checkout
      Then she should see correct total sum at checkout
      
      Scenario: Delete product and check sum on payment page
        
        Given that Deborah has three products in cart
        And she has three products at checkout
        And she has three products on payment page as person
        When she deletes one of the products on the payment page
        Then she should see correct total sum on payment page