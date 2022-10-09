class MinMaxElementArray
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int maxElement = findMax(arr);
		int minElement = findMin(arr);
		System.out.println("max element is "+arr[maxElement]+" at index "+maxElement);
		System.out.println("min element is "+arr[minElement]+" at index "+minElement);

	}

	static int findMax(int[] arr)
	{
		int max = -9999;
		int index = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	static int findMin(int[] arr)
	{
		int min = 9999;
		int index = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
}