package appmodelo

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*
import org.openqa.selenium.WebDriver
import org.springframework.test.annotation.Rollback

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class PeopleFunctionSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {

        //browser.quit()
    }

    void "test something2"() {
        when:"The home page is visited"
            go '/'
        then:"The title is correct"
        	title == "Welcome to Grails"


    }
    /*void "test something"() {
        when:"The home page is visited"
            go 'http://172.17.0.1:8080'
        then:"The title is correct"
            title == "Welcome to Grails"
        cleanup:
            browser.quit()
    }*/


    void "test google"() {
        when:"The home page is visited"
            go 'https://www.google.com.br'
        then:"The title should be 'Google'"
            title == "Google"


    }
}
