package lib.table;
import javax.swing.JTable;

public class JTable_VinhNT02
<
    E extends TableModel_VinhNT,
    F extends TableColumnModel_VinhNT
>

extends JTable{
    public JTable_VinhNT02(E table_Model,F table_column_model){
        super(table_Model,table_column_model);
    }
    
    
}
