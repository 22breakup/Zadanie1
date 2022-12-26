//Задача 2 средняя:
//
//Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»


public class Zadanie2 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] array = str.toCharArray();
        for (int i=1; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++){
                if (array[i]==array[j]) {
                    System.out.println("Повторяющиеся символы " + array[j]);
                    break;

                }
            }
        }


    }
}

