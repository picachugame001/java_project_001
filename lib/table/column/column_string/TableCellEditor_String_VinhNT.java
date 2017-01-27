package lib.table.column.column_string;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

public class TableCellEditor_String_VinhNT
<E extends TableCell_JTextField_String_VinhNT>
extends DefaultCellEditor
{
    
    public TableCellEditor_String_VinhNT(E textField) {
        super(textField);
    }
    @Override
    public Object getCellEditorValue(){
        Object a = super.getCellEditorValue();
        if(a instanceof String){
            String b = ((String)a).trim();
            return b;
        }
        return a;  
    }

}
