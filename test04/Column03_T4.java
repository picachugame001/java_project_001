package test04;
import lib.table.column.column_string.TableColumn_String_VinhNT;
public class Column03_T4
extends  TableColumn_String_VinhNT<View02_T4,Edit04_T4>
{
    public Column03_T4(int index,View02_T4 p1, Edit04_T4 p2){
        super(index,200,p1,p2);
    
    }
    @Override
    public String getDefaultValue(){
        return "value03";
    }
    @Override
    public Object getHeaderValue(){
        return new String("header 3");
    }

}
