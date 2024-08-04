
Feature: Testing the Start Page

  Scenario: Testing the GetStarted Button
    When I click the GetStarted Button 
    Then Home page should be displayed
    
  Scenario: Display of Copyright@NumpyNinja2021 at Start Page
     Then Copyright@NumpyNinja2021 is displayed at Start page

  