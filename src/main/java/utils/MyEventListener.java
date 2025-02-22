package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;


public class MyEventListener implements WebDriverListener {

    @Override
    public void beforeGet(WebDriver driver, String url) {
        System.out.println("I am about to get the url " + url);
    }

    @Override
    public void beforeQuit(WebDriver driver) {
        System.out.println("I am about to quit...");
    }

}
