package appmodelo

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional

@Transactional
@GrailsCompileStatic
class MeuServicoService {

    @SuppressWarnings(['MethodReturnTypeRequired'])
    def serviceMethod() {
        BigDecimal d = 545g
        println d
    }

}

