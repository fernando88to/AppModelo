package appmodelo
import groovy.json.JsonBuilder
class LoggerController {

    def index() {
        def json = new JsonBuilder([teste:123])
        log.error(json.toString())
        render "foi"
    }
    def nullo(){
        BigDecimal teste = null
        teste.plus(1)
        render "foi"
    }
}
