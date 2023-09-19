package java_4_kyu;
public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] text_ = text.split("(?<=\n)");
        for (int i = 0; i < text_.length; i++) {
            for (String symbol : commentSymbols){
                if(text_[i].contains("\n")){
                    text_[i] = text_[i].replaceAll(symbol + ".*?\n","\n");
                }
                if(text_[i].contains(symbol)){
                    text_[i] = text_[i].replace(text_[i].substring(text_[i].indexOf(symbol)),"");
                }
                text_[i] = text_[i].replaceAll("\\s+$","");
                text_[i] = text_[i].replaceAll("\\s+\n","\n");
            }
            if(i != text_.length-1){
                text_[i] = text_[i] + "\n";
            }
        }
        return String.join("",text_);
    }

    public static void main(String[] args) {
        String text = "a #b\nc\nd $e f g";
        String[] commentSymbols = {"#", "$"};
        String solution = stripComments(text,commentSymbols);
        System.out.println(solution);

    }

}
