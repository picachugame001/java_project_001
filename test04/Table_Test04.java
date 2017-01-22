package test04;
import lib.table.JTable_VinhNT;

public class Table_Test04
extends JTable_VinhNT<Table02_Test04,Data01_T4,ColumnModel01_T4>
{
    public Table_Test04(Class<Table02_Test04> a01
    , Class<Data01_T4> a02
    , Class<ColumnModel01_T4> a03
    ){
        super(a01,a02,a03);
    }
}
