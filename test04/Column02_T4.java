package test04;
import lib.table.column.column_string.TableColumn_String_VinhNT;
public class Column02_T4
extends  TableColumn_String_VinhNT<View02_T4,Edit04_T4>
{
    public Column02_T4(View02_T4 p1, Edit04_T4 p2){
        super(1,200,p1,p2);
    
    }
    @Override
    public String getDefaultValue(){
        return "value02";
    }
    @Override
    public Object getHeaderValue(){
        return new String("header 2");
    }

}
