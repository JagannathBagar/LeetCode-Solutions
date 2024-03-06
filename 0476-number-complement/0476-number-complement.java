class Solution {
    public int findComplement(int num) {

        String binaryVal=Integer.toBinaryString(num);
        char[] binArray=binaryVal.toCharArray();

        for(int i=0; i<binArray.length ;i++){

            if(binArray[i]=='1'){

                binArray[i]='0';

            }
            else{

                binArray[i]='1';
            }
        }
        
        String string = String.valueOf(binArray);
        int decimal=Integer.parseInt(string,2);  
        return decimal;
    }
}