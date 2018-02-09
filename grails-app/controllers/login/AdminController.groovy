package login

//import org.springframework.transaction.annotation.Transactional
import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_ADMIN'])

class AdminController {

    def index() { }
}
