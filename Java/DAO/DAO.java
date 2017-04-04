package dao;

import java.util.List;

/**
 *
 * @author Student
 */


public interface DAO<T>  {
    Integer create(T entity);
    
    T read (Integer id);
    
    List<T> readAll();
    
    void update (T entry);
    
    void delete (T entry);
}
