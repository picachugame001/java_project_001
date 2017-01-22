package lib.table.column.column_string;
import javax.swing.table.TableColumn;
import lib.table.TableColumn_VinhNT;

public class TableColumn_String_VinhNT
<E extends TableCellRenderer_String_VinhNT,
 F extends TableCellEditor_String_VinhNT
>
extends TableColumn
implements TableColumn_VinhNT
{
    public TableColumn_String_VinhNT(int index,int width,E a1,F a2){
        super(index,width,a1,a2);
        
    }
    @Override
    public Object getHeaderValue(){
        return new String("default header");
    }
    @Override
    public String getDefaultValue(){
        return new String("abc123");
    }
}
