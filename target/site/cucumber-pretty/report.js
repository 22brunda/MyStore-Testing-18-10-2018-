$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ordermaterial.feature");
formatter.feature({
  "line": 2,
  "name": "As a End User I should able to Order product in MyStore Application",
  "description": "",
  "id": "as-a-end-user-i-should-able-to-order-product-in-mystore-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrderMaterial"
    }
  ]
});
formatter.before({
  "duration": 2289979264,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User able to login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on MyStore Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Enter \"Valid\" Email and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should able to see the MyAccount Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.i_am_on_MyStore_Home_Page()"
});
formatter.result({
  "duration": 11323236077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valid",
      "offset": 9
    }
  ],
  "location": "SigninSteps.i_Enter_Email_and_Password(String)"
});
formatter.result({
  "duration": 5205398606,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.i_should_able_to_see_the_MyAccount_Page()"
});
formatter.result({
  "duration": 38155411,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "as-a-end-user-i-should-able-to-order-product-in-mystore-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@OrderProduct"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see the option to select dress type",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I add the selected dress to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see the successfull message with proceding to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProductSteps.i_click_on_women_tab()"
});
formatter.result({
  "duration": 3994540856,
  "status": "passed"
});
formatter.match({
  "location": "OrderProductSteps.i_should_see_the_option_to_select_dress_type()"
});
formatter.result({
  "duration": 132390718,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan\u003e...\u003c/span\u003e is not clickable at point (0, 0). Other element would receive the click: \u003cdiv class\u003d\"columns-container\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d69.0.3497.92)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dLinux 3.19.0-80-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027qt\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-80-generic\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.92, webStorageEnabled: true}\nSession ID: 52638542f15ae5e0466f821a90d66582\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat com.qwinix.onlinetimesheet.qa.page.OrderProductPage.selectdresstype(OrderProductPage.java:113)\n\tat com.qwinix.onlinetimesheet.qa.steps.OrderProductSteps.i_should_see_the_option_to_select_dress_type(OrderProductSteps.java:21)\n\tat ✽.Then I should see the option to select dress type(ordermaterial.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "location": "OrderProductSteps.i_add_the_selected_dress_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrderProductSteps.i_should_see_the_successfull_message_with_proceding_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?id_category\u003d5\u0026controller\u003dcategory");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 191022336,
  "status": "passed"
});
});