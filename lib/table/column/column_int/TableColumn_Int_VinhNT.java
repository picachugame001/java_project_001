package lib.table.column.column_int;
import javax.swing.table.TableColumn;
import lib.table.TableColumn_VinhNT;

public class TableColumn_Int_VinhNT
<E extends TableCellRenderer_Int_VinhNT,
 F extends TableCellEditor_Int_VinhNT
>
extends TableColumn
implements TableColumn_VinhNT
{
    public TableColumn_Int_VinhNT(int index,int width,E a1,F a2){
        super(index,width,a1,a2);
        
    }
    @Override
    public Object getHeaderValue(){
        return new String("int");
    }
    @Override
    public String getDefaultValue(){
        return new String("0");
    }
}
