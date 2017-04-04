package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Avtomobil;
/**
 *
 * @author Student
 */
public class AvtomobilDAO implements DAO<Avtomobil> {

    private final Connection con;

    public AvtomobilDAO(Connection con) {
        this.con = con;
    }
    
            
    @Override
    public Integer create(Avtomobil entity) {
        
            String sql = "INSERT INTO `salon`.`avtomobil`(`marka`,`kod+proizvoditelya`,`kod+kuzova`,`proizvodstvo`,`color`)VALUES(?,?,?,?,?,?);";
        try(PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ;) {
            stmt.setString(2,entity.getMarka());
            stmt.setInt(1,entity.getProizvoditel().getId());
            stmt.setInt(1, entity.getTipKyzova().getId());
            stmt.setDate(3, new java.sql.Date(entity.getProizvodstvo().getTime()));
            stmt.setInt(4, entity.getColor());
            stmt.execute();
            ResultSet keys = stmt.getGeneratedKeys();
                Integer id = null;
            if (keys.next()) {
                id = keys.getInt(1);
                
            }
            stmt.close();
            return id;
            
        } catch (SQLException ex) {
            Logger.getLogger(AvtomobilDAO.class.getName()).log(Level.SEVERE, null, ex);
                           
        }
        return null;
        
    }

    @Override
    public Avtomobil read(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Avtomobil> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Avtomobil entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Avtomobil entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
