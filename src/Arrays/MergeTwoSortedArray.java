package Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
//        int a1[] ={1,2,3 };
//        int a2[] = {2,5,6};
//
//        int i =0,j=0;
//        int idx = 0;
//        int[] newArr = new int[a1.length + a2.length];
//        while(i<a1.length && j<a2.length){
//            if(a1[i]<a2[j]){
//               newArr[idx++] = a1[i++];
//            }else{
//                newArr[idx++] = a2[j++];
//            }
//        }
//
//        while (i<a1.length){
//            newArr[idx++] = a1[i++];
//        }
//        while(j<a2.length){
//            newArr[idx++] = a2[j++];
//        }
//        for (int k=0;k<newArr.length;k++){
//            System.out.print(newArr[k]+" ");
//        }
//


//        other approach without in place re arangemen
//        without using any other extra space


        int a1[] ={5,6,7,0,0,0};
        int a2[] = {1,2,3};

        int m = 3;
        int n = 3;

        int idx = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            if(a1[i] <= a2[j]){
                a1[idx--] = a2[j--];
            }else{
                a1[idx--] = a1[i--];
            }
        }

        while(j>=0){
            a1[idx--] = a2[j--];
        }
        for (int k=0;k<a1.length;k++){
//            using without any other sapce
            System.out.print(a1[k]+" ");
        }

    }
}
