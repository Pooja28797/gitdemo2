public class Duplicatecharinstring {
    public static void main(String[] args) {
        String str="pooja";
        char []ch=str.toCharArray();
        System.out.println("The string is: " +str);
        System.out.println("duplicate string is:");
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
    }
}
