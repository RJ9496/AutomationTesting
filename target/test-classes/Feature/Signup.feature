Feature: Uniform feature

  Background: Verify login page
    Given User is on Uniform Application
    When User enter "Username" and "Password"
    And Click on Login button
    Then User navigate to Dashboard

  Scenario: User go to category option
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard

  Scenario Outline: User is on category dashboard
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    And User clicks on add button
    Then User enters "category name" and "meta title tag"
    And User clicks on save button
    Then User navigates the Success message

    Examples: 
      | category name |  | meta title tag |
      |           112 |  | ###            |
      | Blazer        |  | B123           |

  Scenario Outline: Verify edit button
    Given User go to category option
    Then User click on catalog  option
    Then User select category
    Then User click on edit button
    Then User edits "99" and "12"
    And User clicks on  the save button
    Then User navigates the success message

    Examples: 
      | Category Name |  | Meta Tag Title |
      |          1111 |  | ####           |

  Scenario: User wants to check sorting functionality
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    Then user wants to sort according to category name
    Then user wants to sort according to sort order

  Scenario: User wants to check  delete functionality
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    Then user selects category
    Then user deletes the category

  Scenario: User wants to navigate from category to home
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    And User clicks on home button
    Then User navigates to dashboard

  Scenario: User wants to rebuild solution of category
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    And User clicks on rebuild button
    Then User navigates success message

  Scenario: User wants to Paginate
    Given User click on catalog  option
    Then User select category
    Then User navigate to category dashboard
    And User wants to go to next page
    Then User is able to navigate to next page

  Scenario: User go to Shopping  option
    Given User click on Shopping  option
    Then User select Coupons
    Then User navigate to Coupon dashboard

  Scenario Outline: User wants to add coupon
    User go to Shopping  option

    Given User click on Shopping  option
    Then User select Coupons
    Then User clicks on Add button
    And enters the "<Coupon Name>","<Code>","<Discount>","<Total Amount>","<products>","<category>","<Date start>","<Date end>","<Uses per coupon>","<Uses per customer>"
    Then user clicks on save button
    Then user navigates to dashboard getting a success message.

    Examples: 
      | Coupon Name |  | Code   |  | Discount |  | Total Amount |  | products |  | category   |  | Date start |  | Date end |  | Uses per coupon |  | Uses per customer |
      | rutu9496    |  | rutu33 |  |       10 |  |         4500 |  | Airbuds  |  | electronic |  |            |  |          |  |                 |  |                   |

  Scenario: User wants to delete coupon
    Given User click on Shopping  option
    Then User select Coupons
    Then User selects coupons to delete
    Then User clicks on delete button
    Then user gets success message and navigates to dashboard.

  Scenario: User wants to navigate from coupon to Home.
    Given User click on Shopping  option
    Then User select Coupons
    Then User clicks on Home button
    Then User navigates to dashboard.

  Scenario: User wants to check sort functionality
    Given User click on Shopping  option
    Then User select Coupons
    Then User sorts according to Coupon name
    Then User sorts according to Code
    Then User sorts according to Discount
    Then User sorts according to Status
    Then User sorts according to Date_start
    Then User sorts according to Date_end

  Scenario: Edit History(Bug)
    Given User click on Shopping  option
    Then User select Coupons
    And User go to edit option
    Then User go to edit History

  Scenario Outline: edit Functionality
    Given User click on Shopping  option
    Then User select Coupons
    Then User clicks on checkbox
    Then User clicks on edit option
    And user edits "<Coupon name>" "<code>"
    Then User clicks on save button

    Examples: 
      | Coupon name |  | code |
      | Offer       |  |   12 |
