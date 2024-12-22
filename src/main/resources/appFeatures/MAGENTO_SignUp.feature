#Author: shahbaz.shaikh.a.w@gmail.com
@CreateAccount
Feature: User Signup Flow

  @TC001 @CreateAccount
  Scenario: TC001 - Validate the navigation to the sign-up page
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed

  @TC002 @CreateAccount
  Scenario: TC002 - Validate the mandatory fields on the sign-up page
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given I am on the "Create New Customer Account" page
    When I leave all mandatory fields blank
    And I submit the form
    Then error messages should be displayed for all mandatory fields indicating they are required

  @TC003 @CreateAccount
  Scenario: TC003 - Validate the creation of a new account
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given I am on the "Create New Customer Account" page
    When I fill in all mandatory fields with valid data
    And I submit the form
    Then a success message should be displayed
    And I should be redirected to the dashboard page

  @TC004 @CreateAccount
  Scenario: TC004 - Validate error handling for invalid email format
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given I am on the "Create New Customer Account" page
    When I enter invalid email formats like "user@", "ser@domain", or "userdomain.com"
    And I submit the form
    Then an appropriate error message should be displayed indicating invalid email format

  @TC005 @CreateAccount
  Scenario: TC005 - Validate password mismatch error
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given I am on the "Create New Customer Account" page
    When I fill in all fields but enter mismatched passwords in "Password" and "Confirm Password" fields
    And I submit the form
    Then an error message should be displayed indicating that passwords do not match

  @TC006 @CreateAccount
  Scenario: TC006 - Validate error for reusing an existing email
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given A valid account already exists for the email address
    When I navigate to the "Create New Customer Account" page
    And I enter the existing email address
    And I submit the form
    Then an appropriate error message should be displayed indicating the email is already in use

  @TC007 @CreateAccount
  Scenario: TC007 - Validate form field placeholders
    Given User opened "https://magento.softwaretestingboard.com/" url
    When I click on the "Create an Account" link
    Then the "Create New Customer Account" page should be displayed
    Given I am on the "Create New Customer Account" page
    When I observe the placeholder text in each field
    Then the placeholder text should be clear, descriptive, and correctly guide users
