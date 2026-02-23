
public class Main
{
	public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int  total = 0;
        int n = arr.length;
        for(int a:arr)
        {
            total+=a;
        }
        int left=0;
        for(int i=0;i<n;i++)
        {
            total-=arr[i];
            if(total == left)
            {
                System.out.println("Equilibrium Index "+i);
            }
            left+=arr[i];
        }
	}
}
