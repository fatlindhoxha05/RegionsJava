/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author Fatlind B. Hoxha
 */
import BLL.Regions;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class RegionsTableModel extends AbstractTableModel{

    
    
    List<Regions> list;
    String [] cols = {"Nr. ","Description"};
    
    
    public RegionsTableModel (){}
    
        public RegionsTableModel (List<Regions> list){
        
            this.list= list;
        
           
        }
        
        public void addList(List<Regions> list){
            this.list= list;
        }
        
    @Override
        public String getColumnName(int col){
            return cols[col];
        }
    
    public int getRowCount() {
      return list.size();
    }
     public void remove(int row){
         list.remove(row);
     }
     
     public Regions getRegions(int index){
         return list.get(index);
     }
     
     
    public int getColumnCount() {
       return cols.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Regions r = list.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return r.getRegionID();
                
            case 1:
                return r.getRegionDescription();
                
            default :
                return null;
        }
    }
    
}
