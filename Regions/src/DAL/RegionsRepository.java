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

public class RegionsRepository extends EntetyMenager implements RegionsInterface {

    public void create(Regions r) throws RegionsException {
      try{
          em.getTransaction().begin();
          em.persist(r);
          em.getTransaction().commit();
          
      }catch(Exception e){
          throw new RegionsException("Message \n"+e.getMessage());
      }
    }

    public void edit(Regions r) throws RegionsException {
      try{
          em.getTransaction().begin();
          em.merge(r);
          em.getTransaction().commit();
          
      }catch(Exception e){
          throw new RegionsException("Message \n"+e.getMessage());
      }
    }

    public void delete(Regions r) throws RegionsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Regions> findAll() throws RegionsException {
    try{
          
          return em.createNamedQuery("Regions.findAll").getResultList();
      }catch(Exception e){
          throw new RegionsException("Message \n"+e.getMessage());
      }
      
    }

    public Regions findByID(Integer ID) throws RegionsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
