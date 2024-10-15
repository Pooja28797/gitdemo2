public class duplicatecharinstringarray {
    public static void main(String[] args) {
        String arr[]={"adc","efg","wqe","efg","tyh"};
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length-1;j++)
            {
                if(arr[i].equals(arr[j])&&(i!=j))
                {
                    System.out.println("duplicate char is " + arr[j]);
                }
            }
        }
    }
}
