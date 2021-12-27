package appmodelo

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional

@Transactional
@GrailsCompileStatic
class MeuServicoService {

    @SuppressWarnings(['MethodReturnTypeRequired'])
    def serviceMethod() {
        def d = 545g
        println d
    }

}

