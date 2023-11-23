public class imp3 {
    public static void main(String[] args) {
        //1. remove special characters from string
        String str = "a!B@c1#2^3";
        System.out.println(str.replaceAll("[a-zA-Z0-9]",""));

        //2. remove extra space from string
        String stg = " abc  def  gh  ";
        System.out.println(stg.replaceAll("\\s+"," ").trim());
        //or
        System.out.println(stg.replaceAll("  ",""));

        //3.find the no. of words in a string
       String words[] = stg.split("\\s");
        System.out.println(words.length);
    }
}
