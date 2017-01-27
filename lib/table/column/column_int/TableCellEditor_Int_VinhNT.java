package lib.table.column.column_int;
import javax.swing.DefaultCellEditor;

public class TableCellEditor_Int_VinhNT
<E extends TableCell_JNumberField_Int_VinhNT>
extends DefaultCellEditor
{
    public TableCellEditor_Int_VinhNT(E textField) {
        super(textField);
    }
    @Override
    public Object getCellEditorValue(){
        Object value = super.getCellEditorValue();
        if(value instanceof String){
            String temp01 = ((String)value).trim();
            
            String temp02 = temp01.replaceAll("^0+","");
            temp01 = temp02.replaceAll("^-0+","-");
            
            if(
                    temp01.equals("")
                ||   temp01.equals("-")
                
            )
            {
                temp01 = new String("0");
            }
            return temp01;
        }
        return value;  
    }
}
