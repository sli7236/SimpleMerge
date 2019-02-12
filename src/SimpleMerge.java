public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int x = 0;
        int y = 0;
        boolean sorted = false;
        int[] mergedArr = new int[arr1.length + arr2.length - 1];
        while (!sorted)
        {
            if (arr1[x] < arr2[y])
            {
                mergedArr[x + y] = arr1[x];
                x++;
            }
            else
            {
                mergedArr[x + y] = arr2[y];
                y++;
            }

            if (y == arr2.length - 1)
            {
                for (x = x; x < arr1.length; y++)
                {
                    mergedArr[x + y] = arr1[x];
                }
                sorted = true;
            }

            if (x == arr1.length - 1)
            {
                for (y = y; y < arr2.length; y++)
                {
                    mergedArr[x + y] = arr2[y];
                }
                sorted = true;
            }

        }
        return mergedArr;
    }

}
