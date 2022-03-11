Feature: course catalog
  As a user I want  to login to elearning website

  Background: 
    Given user is on the application

  @ignore
  Scenario Outline: Test the searching feature of courses
    When Enters the "suman" and "suman"
    And Click the login button
    Then varify the successful login
    When Click on course catalog
    And Enter the "<string>" in search bar
    Then Assert the fetched value with entered "<string>"
    When click on category dropdown and select a category
    Then Assert the search value with categories

    Examples: 
      | string |
      | Demo   |

  @ignore
  Scenario Outline: Test the individual course card feature
    When Create a new account by passing these values "<f_nm>", "<l_nm>", "<email>", "<pass>"
    And click on subscribe button and assert the successful subscription
    And click on  registered course name
    Then Assert the details of registered course

    Examples: 
      | f_nm  | l_nm  | email        | pass       |
      | Divya | Suman | divya@123.co | Divya12345 |
