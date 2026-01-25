class c
public static void seqprimeasc(int q)
	{
		int val=0;
		int[] arr=new int[q];
		for(int i=q;i>1;i--)
		{
			boolean bool = false;
			for(int h=2;h<=i-1;h++)
			{
				if(i%h==0)
				{
					bool=true;
					break;
				}
				else
				{
					bool = false;
				}
			}
			if(bool==false)
			{	
				arr[val]=i;
				val++;	
			}		
			for(int k=0;k<val;k++)
			System.out.println(arr[-k]);
		}		
	}