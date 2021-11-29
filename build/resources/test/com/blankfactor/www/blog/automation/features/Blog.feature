Feature: Blog

  Scenario Outline: Navigate to blankfactor blog section and perform some validations
    Given I navigate to website "http://blankfactor.com"
    When I open blog section
    And I scroll down to "<postTitle>" and click the post
    Then I validate the correct page "<postTitle>" "<postUrl>"
    And I subscribe to the newsletter using the subscribe form "<message>"
    And I go back to the blog section and print a list of the all posts titles with related links

    Examples:
    | postTitle                                     | postUrl                                                         | message                       |
    | Why Fintech in Latin America Is Having a Boom | https://blankfactor.com/insights/blog/fintech-in-latin-america/ | Thank you for your submission |