import com.yourapp.Role
import com.yourapp.Usuario
import com.yourapp.UsuarioRole
class BootStrap {

    def init = { servletContext ->
        
        def user=new Usuario(username:'user', password:'user').save(flush:true)
        def admin=new Usuario(username:'admin',password:'admin').save(flush:true)
        def userRole =new Role(authority:"ROLE_USER").save(flush:true)
         def adminRole =new Role(authority:"ROLE_ADMIN").save(flush:true)
         new UsuarioRole(user:user,Role:userRole).save(flush:true)
         new UsuarioRole(admin:admin,Role:adminRole).save(flush:true)
    }
    def destroy = {
    }
}
