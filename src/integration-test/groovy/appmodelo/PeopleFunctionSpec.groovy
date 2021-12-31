package appmodelo

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*
import org.openqa.selenium.WebDriver
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class PeopleFunctionSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {


    }

    /*void "test something2"() {
        when:"The home page is visited"
            go '/'
        then:"The title is correct"
        	title == "Welcome to Grails"


    }*/

    void "test save"() {
        when:"form save"
            go '/'
            $("#controllers > ul > li > a").click()
            $("body > div.nav > ul > li:nth-child(2) > a").click()

            $("#create-people > form").with {
                name = "admin"
                email = "teste@gmail.com"
                create().click()
            }

        then:"The title is correct"
            //def people = People.findByName('admin')
            //people.email == "teste@gmail.com"

        cleanup:
            browser.quit()


    }





}
