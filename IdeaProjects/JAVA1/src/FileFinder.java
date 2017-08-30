import java.io.File;
public class FileFinder {
    public void findFile(String regex,File file) {
        File[] fileList = file.listFiles();
        if(fileList!= null) {
            for (File fileFromList : fileList) {
                if (fileFromList.isDirectory()) {                              //going inside directory
                    findFile(regex,fileFromList);
                }
                else if (fileFromList.getName().matches(regex)) {      // If file name matches regular expression
                    System.out.println(fileFromList.getAbsolutePath());//printing absolute path of file
                }
            }
        }
    }
}