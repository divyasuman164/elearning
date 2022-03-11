Feature: Connect with the elearning users
  Covered Login, search user, send invitation and send message module

  @social
  Scenario Outline: Search users by its type and send the invitation and message
    Given User is in the application
    When login as a registered user "<username>" "<password>"
    And Navigate to the social network page search the "<user>" and its type and assert it
    And click on send invitation and send the invitation request with "<text>"
    Then Request sent successfully
    When click on send message button and send the "<subject>" and "<message>"
    Then Message sent successfully

    Examples: 
      | username | password | user  | text                        | message             |
      | suman    | suman    | Divya | Please accept my invitation | Good morning Divya! |
