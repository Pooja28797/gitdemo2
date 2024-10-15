public class Palindrome {
    public static void main(String[] args) {
        String str="Pooja", ReversedStr = "";
        for(int i=str.length()-1;i>=0;--i)
        {
            ReversedStr=ReversedStr+str.charAt(i);
        }
        if(str.toLowerCase().equals(ReversedStr.toLowerCase()))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
