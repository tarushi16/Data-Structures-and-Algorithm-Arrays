public class imp2 {
    public static void main(String[] args) {
        //find a no. is binary or not
        //find hexadecimal or not
        //check data is in date format - dd/mm/yy

        //1. binary or not
        int b = 01011011;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        System.out.println(str.matches("[01]+"));

        //2. hexadecimal or not
        String c = "21BCE11241";
        System.out.println(str.matches("[1-9A-F]+"));

        //3. date format
        String d = "16/01/2004";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

    }
}
