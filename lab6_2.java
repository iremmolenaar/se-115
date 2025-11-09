public class lab6_2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 13, 5, 6};

            int[] arr2 = function(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr2[i]);
            }
            }
            public static int[] function ( int[] oldArray){
            int[] tempArray = new int[5];

            for (int i = 0; i < oldArray.length; i++) {
                if (i == oldArray.length-1) {
                    tempArray[i] = oldArray[0];
                }
                else {
                    tempArray[i] = oldArray[i + 1];
                }

            }
            return tempArray;
        }

}

