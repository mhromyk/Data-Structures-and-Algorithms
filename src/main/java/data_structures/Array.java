package data_structures;

public class Array {

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        char tempBox;
        for (int i = 0; i < chars.length / 2; i++) {
            tempBox = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tempBox;
        }
        return String.valueOf(chars);
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        if (array1.length == 0) {
            return array2;
        }
        if (array2.length == 0) {
            return array1;
        }
        int[] mergedArray = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        int mergedArrayIndex = 0;
        int array1Item = array1[array1Index];
        int array2Item = array2[array2Index];

        while ((array1Index < array1.length) || (array2Index < array2.length)) {
            if (array1Item < array2Item) {
                mergedArray[mergedArrayIndex++] = array1Item;
                if ((array1Index + 1) == array1.length) {
                    copyArrayToTheEnd(array2, mergedArray, array2Index, mergedArrayIndex);
                    return mergedArray;
                }
                    array1Index++;

                array1Item = array1[array1Index];
            } else {
                mergedArray[mergedArrayIndex++] = array2Item;
                if ((array2Index + 1) == array2.length) {
                    copyArrayToTheEnd(array1, mergedArray, array1Index, mergedArrayIndex);
                    return mergedArray;
                }
                    array2Index++;

                array2Item = array2[array2Index];
            }
        }

        return mergedArray;
    }

    private static void copyArrayToTheEnd(int[] array, int[] resultArray, int arrayIndex, int resultArrayIndex) {
        for(int i = arrayIndex; i< array.length; i++){
            resultArray[resultArrayIndex++] = array[i];
        }
    }


}
