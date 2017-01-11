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
}
