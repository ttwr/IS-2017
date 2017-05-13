package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Doljnost;

public class DoljnostDAO implements DAO<Doljnost> {
    
    private final Connection con;

    public DoljnostDAO(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Doljnost entity) {
        String sql = "INSERT INTO `salon`.`Doljnost` (`name`, `oklad`, `obyazannost`, `trebovaniya`) VALUES (?, ?, ?, ?);";
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObyazannost());
            st.setString(4, entity.getTrebovaniya());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Doljnost read(Integer id) {
        Doljnost d = null;
        String sql = "SELECT * FROM Doljnost WHERE id = ?;"; 
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                d = new Doljnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObyazannost(rs.getString("obyazannost"));
                d.setTrebovaniya(rs.getString("trebovaniya"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return d;
    }

    @Override
    public List<Doljnost> readAll() {
        List<Doljnost> dolzhnosti = new ArrayList<>();
        String sql = "SELECT * FROM Doljnost"; 
        try (Statement st = con.createStatement();) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Doljnost d = new Doljnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObyazannost(rs.getString("obyazannost"));
                d.setTrebovaniya(rs.getString("trebovaniya"));
                dolzhnosti.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dolzhnosti;
    }

    @Override
    public void update(Doljnost entity) {
        String sql = "UPDATE `salon`.`Doljnost` SET `name` = ?, `oklad` = ?, `obyazannost` = ?, `trebovaniya` = ? WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObyazannost());
            st.setString(4, entity.getTrebovaniya());
            st.setInt(5, entity.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Doljnost entity) {
        String sql = "DELETE FROM Doljnost WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);){
            st.setInt(1, entity.getId());
            st.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Doljnost d) {
        if (d.getId() == null) {
            create(d);
        } else {
            update(d);
        }
    }
    
}