package test04;
import lib.table.TableColumnModel_VinhNT;
public class ColumnModel01_T4
extends TableColumnModel_VinhNT<Data01_T4>
{
    public ColumnModel01_T4(Data01_T4 p1){
        super(p1);
        Edit01_T4 a1 = new Edit01_T4();
        View01_T4 a2 = new View01_T4();
        Edit02_T4 a3 = new Edit02_T4(a1);
        Edit03_T4 a6 = new Edit03_T4();
        View02_T4 a7 = new View02_T4();
        Edit04_T4 a8 = new Edit04_T4(a6);
        Column01_T4 a4 = new Column01_T4(a2,a3);
        Column02_T4 a5 = new Column02_T4(a7,a8);
        Column03_T4 a9 = new Column03_T4(2,a7,a8);
        
        Edit05_T4 a10 = new Edit05_T4();
        Edit06_T4 a11 = new Edit06_T4(a10);
        View03_T4 a12 = new View03_T4();
        Column04_T4 a13 = new Column04_T4(3,a12,a11);
        
        addColumn(a4);
        addColumn(a5);
        addColumn(a9);
        addColumn(a13);
        
    }
}
