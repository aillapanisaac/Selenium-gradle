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


  Scenario: Curses are presented correcty to potential customers
    Given I navigate to www.freerangetesters.com
    When I go to curses using the navigation bar
    And Select introducción al Testing