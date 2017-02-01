package lib.file;

public class File_VinhNT{
    public static String separator;
    public static String path_Main;
    public File_VinhNT(){
        if(separator == null){
            separator = System.getProperty("file.separator");
            ClassLoader loader = File_VinhNT.class.getClassLoader();
            String temp_class_name = "lib/file/File_VinhNT.class";
            String up_bin = "bin/";
            String temp = loader.getResource(temp_class_name)
                .getPath();
            String temp02 = temp.substring(0,temp.length() - temp_class_name.length());
            path_Main = temp02.substring(0,temp02.length() - up_bin.length());
        }

    }

}
