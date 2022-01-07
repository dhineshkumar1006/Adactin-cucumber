Feature: user Check Concept Examples

Scenario Outline: user Signin

Given Launching The Application In Chrome Browser

When user Enters The "<username>" And "<password>"

And user Clicks To Login Button For Signin

Examples:
|username|password|

|adm|min123|

|amin|ad12|

|Admin|admin123|