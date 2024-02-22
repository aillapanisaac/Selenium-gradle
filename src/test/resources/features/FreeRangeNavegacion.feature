Feature: Navigation bar
  To see the subpages
  Without logging in
  I can click the navigate bar link


  Scenario: I can access the subpages through navigation bar
    Given Inavegate to www.freerangetesters.com
    When I try to access the free sections through the navegation bar
    Then I am redirected to the right page