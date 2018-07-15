package test03;
import lib.JButton_VinhNT;
import lib.file.File_VinhNT;
import java.io.IOException;

public class Button_Test_Path
extends JButton_VinhNT
{
    private Text_Test_Path out;
    
    public Button_Test_Path(Text_Test_Path out1){
        super();
        out = out1;
    }
    public void on_Click(){
        File_VinhNT temp = new File_VinhNT();
        out.setText(File_VinhNT.path_Main);
        

        
    }
}

