package day14_StringClass;

public class practice {
    public static void main(String[] args) {
        String gmail= "cybertekschool@gmail.com";

        String userinputGmail= "Cybertek@gmail.com";
        boolean result= gmail.equals(userinputGmail);//false

        if (result){
            System.out.println("Logged in");
        }
        System.out.println("===========================================");
        /*
        valid password MUST contain a special characters such as (!,_,$)
        valid password spaces
         */
        String PassWord= "mmmasd 1235";
        if(PassWord.contains(" ")){
            System.out.println("Password can not have space in it");
        }else{
            System.out.println("valid password");

        }
        System.out.println("=====================");
        /*
        every wesite has www. at begining of the web address
         */
        }

    }

