/*
Method 2 (Rotate one by one):

  leftRotate(arr[], d, n)
  start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
  end
*/

// Example : array[7] = {1,2,3,4,5,6,7};
//			 d = 2, n = 7; 
class Problem_for_array_rotation {
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = a.length;
		// Rotate 2 times
		int d = 2;

		int p = 1; // 'p' will act like a tracker of the 'd' values. 
		while (p <= d) { // for 'd' = 2, the loop condition will remain true for 2 times of iteration as 'p' has initialized with 1.
			int last = a[0];
			for (int i = 0; i < n - 1; i++) {
				a[i] = a[i + 1];
			}
			a[n - 1] = last;
			p++;
		}

		System.out.println("Array after Rotation :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}