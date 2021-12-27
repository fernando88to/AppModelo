package appmodelo

class People {

    Long id
    String name
    Date dateOfBirth
    String email

    static constraints = {
        name maxSize:255, nullable:false, blank:false
        dateOfBirth nullable:false
        email maxSize:255, nullable:false, blank:false
    }

}
