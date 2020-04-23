package day14_StringClass;

public class WebAddress {
    /*
    write a program that can validatr if web address is valid

    valid web address;
    MUST start with www.
    must end with com., edu,or net, or gov
                  .COM .EDU  .NET   .GOV
     */
    public static void main(String[] args) {
        String website= "WWW.cybertek.Gov";
       website=  website.toLowerCase();

       boolean validEnding= website.endsWith(".com")|| website.endsWith(".edu")|| website.endsWith(".gov");
       if(website.startsWith("www.")&& validEnding){
           System.out.println("Valid address");
       }else{
           System.out.println("Invalid address");
       }


    }

}
