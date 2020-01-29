
public class EnlaceBDD {

    
    public static void main(String[] args) {
        
        Modelo modelo=new Modelo();
        
        PreparedStatement ps=null;
        
        conector conn=new conector();
        
        conn.getConexion();
        
        String insert="insert into "+ "articulos(nombre,descripcion,precio) "+ "values(?,?,?) ";
        try {
            ps = conn.getConexion().prepareStatement(insert);
            ps.setString(1, modelo.getNombre());
            ps.setString(2, modelo.getDescripcion());
            ps.setDouble(3, modelo.getPrecio());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnlaceBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
}
