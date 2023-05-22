public class StringBldr {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
         //here no new object is created because of StringBuilder   
        }
        System.out.println(builder.toString());
    }
    
}
