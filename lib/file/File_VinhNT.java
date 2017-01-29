package lib.file;

public class File_VinhNT{
    public static String separator;
    
    public File_VinhNT(){
        if(separator == null){
            separator = System.getProperty("file.separator");
        }
    }

}
