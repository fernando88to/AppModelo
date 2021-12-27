package appmodelo

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*
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
    }

    void "test something"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
        	title == "Welcome to Grails"
        cleanup:
            browser.quit()
    }
}
