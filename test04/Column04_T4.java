package test04;
import lib.table.column.column_int.TableColumn_Int_VinhNT;
public class Column04_T4
extends  TableColumn_Int_VinhNT<View03_T4,Edit06_T4>
{
    public Column04_T4(int index,View03_T4 p1, Edit06_T4 p2){
        super(index,100,p1,p2);
    
    }
    @Override
    public String getDefaultValue(){
        return "123";
    }
    @Override
    public Object getHeaderValue(){
        return new String("header 4");
    }

}
