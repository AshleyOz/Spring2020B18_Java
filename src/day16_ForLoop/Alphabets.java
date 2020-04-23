package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {
        String uppercase= ""; //A~Z
        String lowercase= ""; // a~z

        for (char ch= 'A'; ch<= 'Z';ch++){
            uppercase+=ch;

        }
        System.out.println(uppercase);
        for (char ch = 'a'; ch <='z';ch++){
            lowercase+= ch;
        }
        System.out.println(lowercase);
        // Aa Bb Cc Dd
        String result="";
        for (int i=0; i<= uppercase.length()-1;i++){
            result+= uppercase.charAt(i)+""+ lowercase.charAt(i)+" ";

            System.out.println(result);
        }
        }
    }

