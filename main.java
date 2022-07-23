class Test {
		/**
		 * @param args
		 */
        public static int[] NonZeros( int [] A) {
            int lengthOfB = 0;
            for (int k = 0; k < A.length; k++) {
                if (A[k] != 0) {
                    lengthOfB += 1;
                }
            }

            int [] B = new int[lengthOfB];
            int j = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != 0) {
                    B[j] = A[i];
                    j += 1;
                }
            }
            return B;
        }    

        public static void PrintArray(int [] A) {
            System.out.print("[");
            for (int i  = 0; i < A.length; i++) {
                System.out.print(A[i]);
                if (i < A.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(']');
        }
		public static void main( String [] args )
    {
        System.out.print("Passing ");
        int[] A = {0,1,2,3,2};
        PrintArray(A);
        A = NonZeros(A);
        System.out.print(" got back ");
        PrintArray(A);
	}
}