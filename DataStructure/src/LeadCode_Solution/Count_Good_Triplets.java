package LeadCode_Solution;

public class Count_Good_Triplets {
	public Count_Good_Triplets()
	{
		int [] arr = {3,0,1,1,9,7};
		int a = 7, b = 2, c = 3;
		
		System.out.println(countGoodTriplets(arr,a,b,c));
	}
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				for(int k=j+1;k<arr.length;k++)
//				{
//					// |arr[i] - arr[j]| <= a
//					// |arr[j] - arr[k]| <= b
//					// |arr[i] - arr[k]| <= c
//					if((Math.abs(arr[i]-arr[j])<=a)&&(Math.abs(arr[j]-arr[k])<=b)&&(Math.abs(arr[i]-arr[k])<=c))
//					{
//						count++;
//					}
//				}
//			}
//		}
//		return count;
		
		
		
		int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < n; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
		
		
		
		
	}
}
