public class Countcharinstring {
    public static void main(String[] args) {
        String str = "i am puja";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=0)
                count++;

        }
        System.out.println("No of char in string are : " +count);
    }
}