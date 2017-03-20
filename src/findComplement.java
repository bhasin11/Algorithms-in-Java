
public int findComplement(int num) {

    /*  The approach is to find the leftmost 1 (in binary) of num.
     *  Then create a number which has all 1's till that position of 1.
     *  Eg) Suppose num in binary is 1000, 
     *      then make a temp number =1111.
     *  Finally, XOR of num and i will give us complement of num.
     */
     
    int temp=(Integer.highestOneBit(num)<<1) -1;
    return temp^(num);
}
