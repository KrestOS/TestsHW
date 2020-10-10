import java.lang.reflect.Array;

public class MainHW6 {

    public static void main(String[] args) {
        int[] arr = {1,1,4,1,1,4,1,1};


        after4CutArr(arr);
        System.out.println();
        System.out.println("Проверка содержание массива на 1 и 4 >> " + check1and4Arr(arr));
    }

    //    1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
//    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
//    иначе в методе необходимо выбросить RuntimeException.
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
    public static int[] after4CutArr(int[] arr){
        int n = 0;
        int count = 0;
        int[] arrAfterCut = new int[0];
        System.out.print("Исходный массив:  \n");
        printArr(arr);
        System.out.println();
        for (int i = arr.length-1; i > 0; i--) {

            if (arr[i] == 4){
                count++;
                n = arr.length-i;
                arrAfterCut = new int[n-1];
                System.arraycopy(arr,i+1,arrAfterCut,0,n-1);
                System.out.print("Результат работы метода:  \n");
                printArr(arrAfterCut);
                return arrAfterCut;
            }
        }
        if (count == 0) {
            try {
                throw new RuntimeException();
            }catch (RuntimeException e){
                System.out.println("Нет ни одной четверки!");
            }

        }

        return arrAfterCut;
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] ", arr[i]);
        }
    }
//2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
// то метод вернет false;
// Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false
public static boolean check1and4Arr(int arr[]){
    int count1 = 0;
    int count4 = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1){
            count1++;
        }else if (arr[i] == 4){
            count4++;
        }

    }if (count1 != 0 && count4 != 0 && count1+count4 == arr.length){
        return true;
    }
    return false;
}

}

