import java.util.Scanner;

public class  findmaxint {

    static int maxint(int array[]) {
        int mx = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]>mx){
                mx = array[i];
            }
        }
        return mx;
    }

    static int secondmaxint(int array[]){
        int mx = maxint(array);
        for (int i =0;i<array.length;i++){
            if (array[i]==maxint(array)){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int secondmaxint= maxint(array);
        return secondmaxint;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter elements of array");
        for (int i =0 ; i <array.length;i++){
            array[i]= sc.nextInt();
        }

       /* for (int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }*/

        System.out.println(maxint(array));
        System.out.println(secondmaxint(array));
    }
}
