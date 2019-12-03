# Tradeling QA Automation Assignment
## Instruction to run the project

I have prepared first two test cases using Java and Selenium WebDriver. I could preapre a small framework for this. The details of the framework and the instructions to configure are as follows.

1. You will need to download and install following softwares first.
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
   - [JDK latest](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
   - [GIT](https://git-scm.com/downloads)
2. Then you will need to [clone the tradeling repo](https://github.com/HSGunawardena/tradeling) to local machine.
3. Then you can run your project using IntelliJ IDEA.

## About Binance Test Automation Framework

* The framework was build using the [Page Object Model](https://medium.com/tech-tajawal/page-object-model-pom-design-pattern-f9588630800b).
* Please follow the locations and structure of the framework.
  - **Page Objects** are under ***src/main/java/com/binance/*** folder.
  - **Common Utilities** are under ***src/main/java/utils/*** folder.
  - **Common Resources for Framework** are under ***src/main/resources/*** folder.
  - **WebDriver** is under ***src/main/resources/webDrivers/***
  - **Test Classes** are under ***src/test/com/binance/test/*** folder.
  - **Common Resources for Tests** are under ***src/test/resources/*** folder.
* **src/main/java/com/binance/BinanceETHBTCHomePage.java** file contains the events and actions that can be done in [Binance ETH/BTC](https://www.binance.com/en/trade/ETH_BTC) page.
* Elements that can be done in the [Binance ETH/BTC](https://www.binance.com/en/trade/ETH_BTC) page are listed under **src/main/resources/BinanceETHBTCHomePage.properties**.
* This framework can be used to expand the framework for the whole binance.com web application.

## CI/CD for the repo

* I have created GIT Action for CI and at the moment it only builds the project. We can do necessary actions once the CI requirement is finalized
