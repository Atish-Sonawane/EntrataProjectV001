
![Logo](https://github.com/Atish-Sonawane/EntrataProjectV001/blob/main/Logo/logo%20entrata.png)

# Entrata Automation Framework

The Maven project is designed for automating functionalities on the "entrata.com" website using Selenium. It incorporates organized test cases, Extent Reports for detailed reporting, and logging to track the program flow. Employing the Page Object Model (POM) design pattern enhances code maintainability by encapsulating page elements and actions into dedicated classes. The integration of Maven's dependency management ensures project structure, while Extent Reports facilitate comprehensive result analysis. The addition of logging enhances debugging capabilities, providing a detailed record of the execution sequence. This comprehensive framework offers a robust solution for automated testing on "entrata.com," enabling efficient functionality validation with clear reporting and logging features.


## Badges


[![Selenium Maven POM Framework](https://img.shields.io/badge/Framework-Selenium%20Maven%20POM-brightgreen)](https://github.com/Atish-Sonawane/EntrataProjectV001.git)

[![Java Version](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.java.com/en/download/)




## Acknowledgements
Special thanks to the [Entrata](https://www.entrata.com/) team for providing an excellent platform and inspiring this automation framework.


## Features

- **Page Object Model (POM):** The framework utilizes the POM design pattern for organizing page elements and actions into dedicated classes, improving code maintainability.

- **Extent Reports:** Detailed Extent Reports are generated after test execution, providing a comprehensive view of test results, including pass/fail status and step-wise details.

- **Logging:** The framework incorporates logging to track the program flow and enhance debugging capabilities. Logs provide a detailed record of the execution sequence.

- **Git/GitHub Integration:** The project is version-controlled using Git and hosted on GitHub, allowing for easy collaboration and code sharing.

- **Automation Framework:** The comprehensive automation framework supports efficient functionality validation with clear reporting and logging features.


## Technology Used

- Java
- Maven
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Extent Reports
- logging
- git
- github
- framework
- debugging
- automation
## Run Locally
- lone the Repository:

```bash
  git clone https://github.com/Atish-Sonawane/EntrataProjectV001.git
```

- Navigate to the Project Directory:
```bash
cd EntrataProjectV001
```
- Install Dependencies and Run Tests:

```bash
  mvn clean install 
```
- Review Extent Reports:
Extent Reports are generated in the Reports folder in Project directory. Open the HTML report in a browser for detailed test results.

- Check Logs
If any issue incouter during runing test cases please review the log files which located in Log folder of project directory.



## Environment Variables

To run the Selenium Java-based project using Maven and TestNG, set the following essential environment variables in your project:

`SELENIUM_BROWSER`
`SELENIUM_URL`

`TESTNG_SUITE_FILE`
`LOG_LEVEL`
`SCREENSHOT_ON_FAILURE`
`maven - pom.xml`

These variables are crucial for configuring the test environment, managing browser settings, handling sensitive information, and optimizing Maven configurations. Adjust them according to your project requirements for a seamless testing experience.








## Project Structure
- **src/test/java/com.entrata.PageObject:**  Page Object classes representing different pages of the application. For example, LoginPage.java encapsulates elements and actions on the login page.

- **src/test/java/com.entrata.testCases:**  All the TestCase collected here with the Base Class.takes care of Browser setup, loading configuration file and other reusable methods like screenshot, handling sync issues and many more.

- **src/test/java/com.entrata.utilities:**  Utility classes, such as WebDriverwait, Extent and Read-config containing reusable methods related to WebDriver interactions.

- **Configuration:** Configuration files, including config.properties for storing parameters like URLs, credentials, timeouts, etc.

- **Log:** Logs provide information about the execution flow, helping developers identify where an issue occurred.

- **Logo:** It store the projecct logo and images related to work.

- **Report:** This folder stored the extent report that are created after execuation of testcases.

- **Screenshot:** Captures screenshots of failed test cases. It essential for providing visual proof and detailed information when tests encounter failures.

- **src:** Main source code and resource directory in Maven. It houses both application code (main) and test-related code (test).

- **target:** Maven's temporary output directory during the build. It stores compiled bytecode, JARs, and other build artifacts.

- **test-output:** Exclusive to TestNG, storing generated test reports and Includes insights into test results like passed and failed tests.

- **extent-config.xml:** The "extent-config.xml" file is a configuration file used by Extent Reports to customize the appearance and behavior of the generated reports. It includes settings such as report theme, document title, and other configurations related to report formatting.

- **log4j.properties:** It is a configuration file used for setting up logging in your automation framework. 

- **pom.xml:** Maven Project Object Model file specifying project dependencies, build settings, and plugins.

- **README.md:** Documentation file providing information about the project.

- **run.bat:** Batch file is a script file in DOS and windows used to run scripts that consist of multiple commands executed by a command line interpreter.

- **testng.xml:** TestNG. xml file is a setup/configuration file that helps us in organizing our test cases in the right pattern. It also helps us in making Test Suites and Test methods. By using the XML file approach, it makes it easy to understand the code.

*Feel free to adapt this structure based on your specific project requirements. This structured layout promotes organization, maintainability, and ease of collaboration.*





## TestCases

Below is a list of test cases covering various functionalities in the Entrata Automation Framework. Use this table to understand and track the test coverage.

| Test Case ID | Test Case Description | Test Steps | Expected Result | Actual Result | Status |
|--------------|-----------------------|------------|------------------|---------------|--------|
| TC001        | Contact-us Functionality   | 1. Open the application <br> 2. Go the Resident login and clik on vew Website <br> 3. Provide contact Details | Contact details submitted successfully | Contact details submitted | Pass |
| TC002        | Check available Resources | 1. Open the application <br> 2. Go to resources <br> 3. click on Webinars | Check Webinars are present | Webinar is present | Pass |
| TC003        | Demo for accounting  | 1. open the application <br> 2. click on "Accounting"block <br> 3. Clik on schedule Demo and provide Details | Details successfully submitted for schedule Demo  | Details Submitted| Pass |
| TC004        | Validating page title  | 1. Open application and Navigate to the Product <br> 2. click on "Resident Services" | Tilename should be as excepted | Title is verify | Pass|


*Note: Update the "Status" column after executing each test case (e.g., "Pass," "Fail," or "Pending").*

## 📊 Extent Report
extent-config.xml file provides a good representation of test execution output and is designed to create reports that are clear to everyone by creating graphs regarding test execution time, overall test result overviews, test result history, etc.
- **Extent Report** [All extent reports](https://github.com/Atish-Sonawane/EntrataProjectV001/tree/main/Report)
## Authors

- [@ Atish Sonawane]
(https://github.com/Atish-Sonawane)   
(https://www.linkedin.com/in/atish-sonawane/)



## Support

For any issues or questions, please contact [atishsonawane111299@gmail.com].


## 🚀 About Me

Hello there! 👋 I'm Atish Sonawane, a passionate Full Stack QA based in Pune. I love to work on Automation Testing and enjoy learning new technology in my free time.


### 🌱 I’m Currently Learning

I'm always eager to learn and stay up-to-date with the latest in the tech world. Currently, I am exploring:

- Different testing technology and Docker
- Jenkins for learn CI\CD pipeline

### 📫 How to Reach Me

- **GitHub:** [My GitHub Profile](https://github.com/Atish-Sonawane)
- **LinkedIn:** [My LinkedIn Profile](https://www.linkedin.com/in/atish-sonawane/)
- **Email:** atishsonawane111299@gmail.com




## Feedback

If you have any feedback, please reach out to us at 
- **Email:** atishsonawane111299@gmail.com


## Contributions

Contributions are always welcome!

f you'd like to contribute to the framework, please fork the repository and create a pull request.

