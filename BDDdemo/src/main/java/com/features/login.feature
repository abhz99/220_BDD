@login
Feature: JBK offline application

@jbk
Scenario Outline: login test

Given user should be on login page
When user enters "<uname>" and "<passwd>"
Then user should be on home page

Examples:

|uname				|passwd | 
|kiran@gmail.com	|123456 |
|abhz@gmail.com		|hfjdkd |
|bagira@gmail.com	|qwert  |

Scenario: logo test

Given user should be on login page
Then user should see JBK logo 