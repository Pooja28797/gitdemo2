public class Reversestring {
    public static void main(String[] args) {
        String str = "I am Pooja";
        String reversed = reverseString(str);
        System.out.println("original string is " + str);
        System.out.println("Reversed String is " + reversed);
    }
        public static String reverseString(String str)
        {
            StringBuilder reversed=new StringBuilder();
            for(int i=str.length()-1;i>=0;i--)
            {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }




}
