
package recursohumanocrud;

import java.sql.SQLException;


public class Read {
    public Read() throws SQLException{
        System.out.println("<<CONSULTA DE REGISTROS>>");
        mostrarResultados();//Llama el metodo dentro de esta clase
        
    }
    
    private void mostrarResultados() throws SQLException{
        try{
            ConexionCRUD utilerias=new ConexionCRUD();
            String tabla="tb_contacto";
            String camposTabla="*";
            //Condicion se envia vacia para indicar que todos los registros se necesecitan mostrar
            
            String condicionBusqueda="";
            //Metodo que realiza la busqueda
            utilerias.desplegarRegistro(tabla, camposTabla, condicionBusqueda);
          
            
            
        }catch(SQLException ex){
            System.out.println("Ha ocurrido el siguiente error:" + ex.getMessage());
        }finally{
            MenuPrincipal.desplegarMenu();
        }
    }
}
