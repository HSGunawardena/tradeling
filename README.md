# Tradeling QA Automation Assignment
## UI Testing - Acceptance Criteria 01 and 02
### Instruction to run the project

I have prepared first two test cases using Java and Selenium WebDriver. I could preapre a small framework for this. The details of the framework and the instructions to configure are as follows.

1. You will need to download and install following softwares first.
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
   - [JDK latest](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
   - [GIT](https://git-scm.com/downloads)
2. Then you will need to [clone the tradeling repo](https://github.com/HSGunawardena/tradeling) to local machine.
3. Then you can run your project using IntelliJ IDEA.

### About Binance Test Automation Framework

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

### CI/CD for the repo

* I have created GIT Action for CI and at the moment it only builds the project. We can do necessary actions once the CI requirement is finalized

### Used resources for UI framework
* [Image capturing](https://github.com/pazone/ashot)
* [Continuous Integration dengan Selenium dan Gitlab-CI](https://www.youtube.com/watch?v=-XVVtS66gyQ&t=19s)

## WebSocket Testing - Acceptance Criterion 03

I did not posess knowledge about how WebSockets were tested initially. So, I had to find online resources to learn about WebSockets and how those were tested using Binance APIs. Some of the resources are listed below.

I was able to use binance npm package to connect to binance websockets and retrieve some data. I have uploaded the ***demo.js*** file to this same repository under a folder called ***test03*** which contains the requests and responses I prepared. From that, I think we can prepare tests but as I have limited knowledge on this, I have prepared what I could at the moment.

#### Used Online Resources

* [Binance Node Package](https://www.npmjs.com/package/binance)
* [How to stream trades from Binance web socket API in Node.js?](https://stackoverflow.com/questions/50793699/how-to-stream-trades-from-binance-web-socket-api-in-node-js)
* [NodeJS WebSocket Programming Examples](https://www.pubnub.com/blog/nodejs-websocket-programming-examples/)
* [JSON event based conversion WebSockets](https://thoughtbot.com/blog/json-event-based-convention-websockets)
* [Binance Adopts "BCH" Ticker](https://www.youtube.com/watch?v=_giVdd2r_zU)
* [WebSockets Crash Course](https://www.youtube.com/watch?v=2Nt-ZrNP22A)
* [What are WebSockets | How is it different from HTTP?](https://www.youtube.com/watch?v=i5OVcTdt_OU)
* [Websocket connections with Postman? (Websocket client for testing)](https://www.youtube.com/watch?v=mmdZdlv5j5A)
* [How to use Websockets Stream for Binance Exchange in less than 10 lines of code.](https://youtu.be/E0NsN0BADDo)
* [Binance API documentation](https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md#start-user-data-stream-user_stream)
* [How to stream Binance Websockets data into browser](https://www.youtube.com/watch?v=FIF9An-nGgU)
