
package recursohumano;

import java.sql.SQLException;
import java.util.Scanner;


public class Update {
    Update() throws SQLException {
        Scanner leer = new Scaner(System.in);
        Persona person = new Persona();
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("Actualizar Registros");
        
        System.out.println("Ingresar id del registro a modificar:  ");
        Person.setIdPersona(leer.nextInt());
        
        String tablaBuscar = "tb_contacto";
        String campoBuscar = "id_contacto, nom_contacto, email_contacto, tel_contacto";
        String condicionBuscar = "id_contacto = " + person.getIdPersona();
        utilerias.desplegarRegistros(tablaBuscar, campoBuscar, condicionBuscar);
        
        System.out.println("Nombre: ");
        person.setNomPersona(leer.next());
        
        System.out.println("Correo Electronico: ");
        person.setEmailPersona(leer.next());
        
        System.out.println("Telefono: ");
        person.setTelPersona(leer.next());
        
        String tabla = "tb_contacto";
        String camposValoresNuevos = "nom_contacto = ´" + person.getNomPersona() + "', email_contacto = '"
                + person.getEmailPersona() + "', tel_contacto = '" + person.getTelPersona() + "'";
        
        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("Modificado correctamente");
        
        MenuPrincipal.desplegarMenu();
        
    }
    
}
