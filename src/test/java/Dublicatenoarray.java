public class Dublicatenoarray {
    public static void main(String[] args) {
        int arr[]={34,56,21,56,43,78};
        for (int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])

                    System.out.println(arr[j]);

            }
        }
    }
}
