import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver

environments {

    remote {

        //dev is hostname of the machine where the code is running.
        baseUrl = "http://appmodelo_jenkins:8888"

        driver = {
            def url = new URL("http://selenium-hub:4444")


            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setPlatformName("Linux")
            new RemoteWebDriver(url, firefoxOptions);
        }
    }
    // run via “./gradlew -Dgeb.env=chrome iT”
    chrome {
        driver = { new ChromeDriver() }
    }


    // run via “./gradlew -Dgeb.env=chromeHeadless iT”
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            o.addArguments('disable-gpu')
            new ChromeDriver(o)
        }
    }

    // run via “./gradlew -Dgeb.env=firefox iT”
    firefox {
        driver = { new FirefoxDriver() }
    }
}


