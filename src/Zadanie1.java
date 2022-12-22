public class Zadanie1 {
        public static void main(String[] args) {
            int n = 100;
            Double [] array = new Double[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }
            double max = array[0];
            double min = array[0];
            double avg = 0;
            for (int i=0; i < array.length;i++) {
                if(max < array[i])
                    max = array[i];
                if(min > array[i])
                    min = array[i];
                avg += array[i]/array.length;
            }
            System.out.println("Минимальное " + min);
            System.out.println("Максимальное " + max);
            System.out.println("Среднее " + avg);

        }


    }

