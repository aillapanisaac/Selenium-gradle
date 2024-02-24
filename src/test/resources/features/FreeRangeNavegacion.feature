@Navigation
Feature: Navigation bar
  To see the subpages
  Without logging in
  I can click the navigate bar link

  Background: I am on the Free Range Testers web without logging in.
    Given I navigate to www.freerangetesters.com

  Scenario Outline: I can access the subpages through navigation bar
    When I go to <section> using the navigation bar

    Examples:
    | section    |
    | Cursos     |
    | Recursos   |
    | Udemy      |
    | Mentorías  |
    | Newsletter |

    @Courses
 Scenario: Courses are presented correcty to potential customers
    When I go to Cursos using the navigation bar
    And I select Introducción al Testing


   @Plans
  Scenario: Users can select a plan when signing up
    When I select Elegir plan
    Then I can validate the options in the checkout page