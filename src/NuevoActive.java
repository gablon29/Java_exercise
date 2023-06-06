import java.util.Scanner;

public class NuevoActive {
//    public static void main(String[] args) {
//        int index = 1;
//        int numUser;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Written of the number");
//        numUser = scanner.nextInt();
//        while(index <= 10) {
//            int result = index * numUser;
//            System.out.println(index + " x " + numUser + " = " + result );
//            index++;
//        }
//
//    }
    // logica para detectar palabras palindromas
//public static void main(String[] args) {
//    System.out.print("Written the String ");
//    Scanner scanner = new Scanner(System.in);
//    String word = scanner.nextLine();
//        char letra = word.charAt(0);
//        char indexS = word.charAt(1);
//        char lastIndexDos = word.charAt(word.length() - 2);
//        char lastIndex = word.charAt(word.length() - 1);
//        if(letra == lastIndex && indexS == lastIndexDos) {
//            System.out.println("La palabra es poligoma");
//        } else {
//            System.out.print("La palabra no poligoma");
//        }
//    scanner.close();
//}
public static void main(String[] args) {
    int[] arrayDesordenado = {1, 5, 9, 2, 3, 8, 4};
    orderDeArray(arrayDesordenado);
    }
    public static void orderDeArray(int[] array) {
    boolean order = true;
    int n = array.length;
    while(order) {
        order = false;
        for(int i = 0; i < n - 1; i++) {
            if(array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                order = true;
            }
            n--;
        }
    }
    System.out.print(array);
    }
}
