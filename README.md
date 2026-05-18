# IM24X7 Automation Framework

## Project Overview
THis project is developed for the IM24X7 QA Automation Assignment using Selenium WebDriver with Java and TestNG.

Test Application:
https://saucedemo.com/

----
## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven

  ----
  ## Framework Structure

  ```text
  /tests
  /pages
  /utils
  /reports
  /screenshots
  /testcases
  ```

  ---

  ## Test Scenarios Covered

  ### Login Flow
  - Valid Login
  - Invalid Login
  - Empty Password
  - Empty Username
  - Empty Username and Password
  - Special Character Login

  ### Dashboard Validation
  - URL Validation
  - Title Validation
  -  Cart Icon Validation
  -  Menu Button Validation
 
  ### Add To Cart Flow
  - Add Item To Cart
  - Verify Cart Badge Count
  - Verify Cart Item
 
  ### Logout Flow
  - Logout Validation
  - Redirect To Login Page
 
  ## Supporting Documents
  The following documents are available inside the `/testcases' folder:
  - TestCases.xlsx
  - BugReport.xlsx

  ---

  ## How to Run
  Run `testng.xml`  using Intellij IDEA

  OR

  ```bash
  mvn test
  ```

  ---

  ##  Feature Implemented
  - Page Object Model (POM)
  - Resusable Methods
  - Screenshot Capture On Failure
  - Organized Framework Structure
 
  ---

  ## Author
  Prajwal Sulke
