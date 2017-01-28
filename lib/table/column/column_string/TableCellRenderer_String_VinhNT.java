package lib.table.column.column_string ;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import java.awt.Component;

public class TableCellRenderer_String_VinhNT
extends  DefaultTableCellRenderer
{
    public TableCellRenderer_String_VinhNT(){
        super();
    }
    /*@Override
    public Component getTableCellRendererComponent(JTable table,
        Object value,
        boolean isSelected,
        boolean hasFocus,
        int row,
        int column)
    {
        
        if(value instanceof String){
            String temp01 = ((String)value).trim();
            return super.getTableCellRendererComponent(table,temp01,isSelected,
                hasFocus,row,column);
        }
        return super.getTableCellRendererComponent(table,value,isSelected,
                hasFocus,row,column);
        
    }*/
}
