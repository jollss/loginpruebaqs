package login
import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_MECANICO'])
class MecanicosController {

    def index() {
    def username="jollss"
    [usu:username]
    
    
    }
}
