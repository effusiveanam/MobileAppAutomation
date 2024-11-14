# Calculator-app-automation

## Android app Automation with Appium:
App Automation with Selenium Appium refers to using Appium, an open-source mobile application automation testing framework, in conjunction with Selenium, an open-source web application automation testing framework, to automate the testing of mobile applications.
Appium is a cross-platform tool that enables automation of native, hybrid, and mobile web applications on iOS and Android platforms. Selenium is primarily used for automating web applications and has limited support for mobile applications. However, by using Appium with Selenium, developers can automate the testing of mobile applications across multiple platforms.

## App Name: 
- [Calculator](https://apkpure.com/calculator/com.google.android.calculator/)

## APK build version downloader:
- [APK link](https://apkpure.com/calculator/com.google.android.calculator/downloading)

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
