public class Algorithm2DArrays {
    /**
     * Return true if target is found in the 2D array arr, false otherwise.
     * For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     * and target is 5, this method returns true. If target is 15, returns false
     *
     * @param arr    2D array of ints
     * @param target target value to be searched for in arr
     * @return true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target) {
        for (int[] row : arr) {
            for (int val : row) {
                if (val == target) {
                    return true;
                }
            }
        }
        /* implement this method! */
        return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param target  searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)

    {
        int count = 0;

        for( String[] row : arr)
        {
            for(String str : row)
            {
                if(str.indexOf(searchStr) != -1)
                {
                    count++;
                }
            }
        }
        /* implement this method! */
        return count;
    }


    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It also returns the number of changes that were made.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr)
    {
        int count = 0;
        for (int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[0].length; col++)
            {
                int element = arr[row][col];
                if(element % 2 == 0)
                {
                    arr[row][col] = 0;
                    count++;
                }
            }
        }
        return count;
        /* implement this method! */
    }

    /** Return the sum of all elements of arr that are in the one particular row,
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     */

    public static int sumForRow(int[][] arr, int row)
    {
        int sum  = 0;

        for()
        /* implement this method! */
    }


    public static double average(int[][] numArray)
    {
        double sum =0;
        for(int[] row : numArray)
        {}
        for(int val : row)
        {
            sum+= val;

        }
        int totalElements = numArray.length * numArray[0].length;
        return sum/ totalElements;
    }

    public static int[] indexFound(String[][] strArray, String target)
    {int[] foundIndex = new int[2];

        for(int row=0; row < strArray.length; row++)
        {
            for(int col = 0; col < strArrray0[.length; col++]
            {})
            String element = strArray[row][col];
            if(element.ewuals(target))
            {
                foundIndex[0] = row;
                foundIndex[1] =col;

                return foundIndex;
            }
        }

        foundIndex[0] = -1;
        foundIndex[1] = -1;
        return foundIndex;
    }

}

