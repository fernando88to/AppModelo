//supresss all warnings for plugin codenarc of the intellij idea
//file:noinspection all

ruleset {

    description '''
        A Sample Groovy RuleSet containing all CodeNarc Rules, grouped by category.
        You can use this as a template for your own custom RuleSet.
        Just delete the rules that you don't want to include.
        '''

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')

    //ruleset('rulesets/convention.xml')
    ruleset('rulesets/convention.xml') {
        'NoDef' {
            enabled = false
        }
        'FieldTypeRequired'{
            enabled = false
        }
    }


    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')

    ruleset('rulesets/formatting.xml')


    ruleset('rulesets/generic.xml')
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')
    ruleset('rulesets/grails.xml')

}