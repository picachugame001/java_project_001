package lib.table.column.column_string;
import javax.swing.table.TableColumn;

public class TableColumn_String_VinhNT
<E extends TableCellRenderer_String_VinhNT,
 F extends TableCellEditor_String_VinhNT
>
extends TableColumn
{
    public TableColumn_String_VinhNT(E a1,F a2){
        super(1,200,a1,a2);
        
    }
}
