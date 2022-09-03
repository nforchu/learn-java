public class Alphabet {

    void loopThroughAtoZ (){
        char letter = 'A';
        char lowercase;
        for (int i = 1; i <=26; i++) {
            lowercase = (char)(letter+32);
            System.out.print(String.format("%s%s ", letter++, lowercase));
        }
    }
}
