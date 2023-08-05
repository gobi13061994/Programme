package String;

public class EvenReverse {
    public static void main(String[] args) {
        String input="This war happened in two years back";
        String output="This raw happened ni two sraey back";
        String[] s = input.split(" ");
        String realOutput="";
        for (int i = 0; i < s.length-1; i++) {
            String reverse="";
            if (i%2==1){
                String re = s[i];
                for (int j = re.length()-1; j>=0; j--) {
                    char revChar = re.charAt(j);
                    realOutput=realOutput+revChar;
                }
            }else if(i%2==0){
                realOutput=realOutput+" "+s[i]+" ";
            }
        }
        System.out.println(realOutput);
    }
}
