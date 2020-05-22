/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Fatlind B. Hoxha
 */
import java.util.List;
import BLL.Regions;

public interface RegionsInterface {
    
    
    void create(Regions r) throws RegionsException;
        
    void edit(Regions r) throws RegionsException;
    
    void delete (Regions r) throws RegionsException;
    
    List<Regions> findAll() throws RegionsException;
    Regions findByID(Integer ID) throws RegionsException;
    }
