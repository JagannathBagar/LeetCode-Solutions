class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] arr : image){

            arr=reverseArray(arr);

            for(int i=0; i<arr.length; i++){

                if(arr[i]==0){
                    arr[i]=1;
                }
                else{
                    arr[i]=0;
                }
            }
        }

        return image;


    }


    public static int[] reverseArray(int[] arr){

        for(int i=0; i<arr.length/2 ; i++){

            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        return arr;

    }
}