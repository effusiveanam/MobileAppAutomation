# Calculator-app-automation

## Android app Automation with Appium:
Appium is used for automating mobile apps, including native, hybrid, and mobile web apps. Appium can test apps on real devices, emulators, and simulators. It supports multiple programming languages, including Java, Python, Ruby, NodeJS, JavaScript, C#, and PHP. 
Selenium is used for automating web applications across different browsers and OS environments. Selenium was first released in 2004. It's primarily written in Java, but also offers bindings for other languages, such as Python and Ruby.
How they work -
Appium and Selenium both work like servers that run in the background. Appium uses the Selenium WebDriver JSON Protocol to interact with mobile apps. Selenium uses the WebDriver API to automate web browsers.
Features - 
Appium has a built-in UI Automator for inspecting mobile apps and generating detailed information logs. Selenium enables cross-browser testing, allowing you to test and verify web applications for consistency and correctness across different browsers.
Programming skills - 
Both Appium and Selenium require intermediate to advanced programming skills for scripting and customization.
Cost - 
Both Appium and Selenium are free and open-source.


## App Name: 
- [Calculator](https://apkpure.com/calculator/com.google.android.calculator/)

## IDE Used:
- IntelliJ Idea
- Appium
- Android Studio

## Prerequisites:
- Install Android Studio latest version
- Install Appium 
- Install jdk or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME Stable internet connection

## Langueges
- Java

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file
- Set required configuration
- Execute command in cmd for checking the connectivity with emulator : adb devices
- Open Appium Server with following command: appium -p 4723
- Open Appium Inspector
- Open Intellij Idea
- Execute the following command into the terminal: 
   gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results

## Automation Steps: 
I have implemented in the following test automation steps.
- Summation of 2 numbers (9+5=14)
- Subtraction of 2 numbers (8-3=5)
- multiplied of 2 numbers (14*5=70)
- Division of a number by 10 (70/10=7)

## Screenshots:

<img width="1036" alt="Screenshot 2024-11-14 at 11 56 27 AM" src="https://github.com/user-attachments/assets/20848cc8-7032-430e-b598-91ab3c4e02eb">

<img width="1361" alt="Screenshot 2024-11-14 at 12 21 17 PM" src="https://github.com/user-attachments/assets/37cc47c9-99fe-4b34-98a7-5c80d6ea15bd">

<img width="1309" alt="Screenshot 2024-11-14 at 12 33 40 PM" src="https://github.com/user-attachments/assets/1e893c60-5b4b-4c8b-9755-6a04658a8c85">

<img width="807" alt="Screenshot 2024-11-14 at 12 34 37 PM" src="https://github.com/user-attachments/assets/2e07c139-0f1e-44c5-bc79-3e3897a8fb1c">









