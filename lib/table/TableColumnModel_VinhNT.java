package lib.table;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class TableColumnModel_VinhNT
<E extends TableModel_VinhNT>
extends DefaultTableColumnModel
{
    private E model01;
    public TableColumnModel_VinhNT(E model){
        super();
        model01 = model;
    }
    @Override
    public void addColumn(TableColumn aColumn){
        super.addColumn(aColumn);
        model01.addColumn(null);
    }
    public void newRow(){
        int max = getColumnCount();
        Object[] arrayValue = new Object[max];
        for(int i=0;i<max;i++){
            arrayValue[i] = ((TableColumn_VinhNT)getColumn(i)).getDefaultValue();
        }
        model01.addRow(arrayValue);
    }
}
