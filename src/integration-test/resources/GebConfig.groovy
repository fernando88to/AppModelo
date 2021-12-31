import com.google.common.io.BaseEncoding
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

environments {

    remote {


        baseUrl = "http://dev:8080/"
        driver = {


           /* def remoteWebDriverServerUrl = new URL("http://127.0.0.1:4444/wd/hub")
            def capabilities = new DesiredCapabilities()
            capabilities.setBrowserName("firefox")
            new RemoteWebDriver(remoteWebDriverServerUrl, capabilities)
*/



            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setPlatformName("Linux")
            def url = new URL("http://selenium-hub:4444")
            new RemoteWebDriver(url, firefoxOptions);

            /*def url = new URL("http://selenium-router:4444")
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("chrome");
            new RemoteWebDriver(url,caps)*/

            /*ChromeOptions chromeOptions = new ChromeOptions()
            chromeOptions.setPlatformName('Linux')
            //def url = new URL("http://selenium-hub:4444/wd/hub")
            def url = new URL("http://172.26.0.6:5555/wd/hub")
            new RemoteWebDriver(url, chromeOptions)*/

            /*FirefoxOptions firefoxOptions = new FirefoxOptions();
            def profile = new FirefoxProfile()
            firefoxOptions.setProfile(profile);
            firefoxOptions.setCapability("marionette", true);
            def url = new URL("http://selenium-hub:4444/wd/hub")
            new RemoteWebDriver(url, firefoxOptions);*/


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


