
class SumTripal {

	boolean find3Numbers(int A[], int arr_size, int sum)
	{
		int l, r;

		for (int i = 0; i < arr_size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < arr_size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
						return true;
					}
				}
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		SumTripal triplet = new SumTripal();
		int A[] = { 1, 2, 6, 9, 3 };
		int sum = 13;
		int arr_size = A.length;

		triplet.find3Numbers(A, arr_size, sum);
	}
}
