Feature: Navigation bar
  To see the subpages
  Without logging in
  I can click the navigate bar link


#  Scenario Outline: I can access the subpages through navigation bar
#    Given I navigate to www.freerangetesters.com
#    When I go to <section> using the navigation bar

#    Examples:
#    | section    |
#    | Cursos     |
#    | Recursos   |
#    | Udemy      |
#    | Mentorías  |
#    | Newsletter |


# Scenario: Curses are presented correcty to potential customers
#    Given I navigate to www.freerangetesters.com
#    When I go to Cursos using the navigation bar
#    And select Introducción al Testing


  Scenario: Users can select a plan when signing up
    Given I navigate to www.freerangetesters.com
    When I select Elegir plan
    Then I can validate the options in the checkout page