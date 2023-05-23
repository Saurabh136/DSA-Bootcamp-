import java.io.File;

class WriteAFile {
    public static void main(String[]args) {

        //create a file object for the current location
        File file = new File("JavaFile.java");

        try {

            // create the file with name specified
            //by the file object
            Boolean value = file.createNewFile();
            if (value) {
                System.out.println("New Java file is created ");

            }
            else {
                System.out.println("The file already exists ");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}