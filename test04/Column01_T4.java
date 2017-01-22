package test04;
import lib.table.column.column_string.TableColumn_String_VinhNT;
public class Column01_T4
extends  TableColumn_String_VinhNT<View01_T4,Edit02_T4>
{
    public Column01_T4(View01_T4 p1, Edit02_T4 p2){
        super(0,100,p1,p2);
    
    }
    @Override
    public String getDefaultValue(){
        return "value01";
    }
}
