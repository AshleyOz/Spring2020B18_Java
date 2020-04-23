package day21_MultiDimentinalArrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String [] names= {"Reem", "Omer", "Muhtar","Emrah", "Mohammed","Ana"};

        int maxLenghtString = names[0].length();//4(Reem)
        int minLenghtString = names[0].length();

        String longestword= names[0];
        String ShortestWord=names[0];

        for (int i=1; i<= names.length; i++ ){

            if (names[i].length()> maxLenghtString){
                maxLenghtString= names[i].length();
                longestword=names[i];
            }
            if (names[i].length()<minLenghtString){
                minLenghtString=names[i].length();
                ShortestWord= names[i];
            }
        }
        System.out.println(longestword);
        System.out.println(ShortestWord);

    }
}
