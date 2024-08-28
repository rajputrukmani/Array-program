public class Array
  {
    public static void main(String[]args)
    {
      int arr[]={3,7,2,9,1,8,4,6};
      for(int i =0;i<arr.length;i++)
        {
          for(int j=0;j/,arr.length;j++)
            {
              if(arr[j]>arr[j+1])
              {
                int t;
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
              }
            }
        }
          System.out.println(arr[arr.lenth-3]);
    }
  }
