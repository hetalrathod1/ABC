@ContactUS
Feature: contactUs field functionality

Background: user is on homepage

  Scenario: user is able to send message to customer service in contact us section

    Given user click on Contact Us
    When user enter all valid email id and subject
    And user write message in message field
    Then click on send button
    And user is able to seee Your message has been successfully sent to our team.
