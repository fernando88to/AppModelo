import com.google.common.io.BaseEncoding
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

environments {

    remote {


        driver = {

           /* def remoteWebDriverServerUrl = new URL("http://127.0.0.1:4444/wd/hub")
            def capabilities = new DesiredCapabilities()
            capabilities.setBrowserName("firefox")
            new RemoteWebDriver(remoteWebDriverServerUrl, capabilities)
*/

            FirefoxOptions firefoxOptions = new FirefoxOptions();
            def url = new URL("http://127.0.0.1:4444/wd/hub")
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


