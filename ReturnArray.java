class ReturnArray{
    static int[] get(){
        return new int[]{10,20,30,49,59};
    }
    public static void main(String[] args){
        int arr[]=get();
        for(int i=0; i<arr.length; i++)
        System.out.println(arr[i]);
    }
}