public class z3 {public static void main(String[] args) {

    int n = 10;
    double[] array = new double[n];
    for (int i = 0; i < array.length; i++) {
        array[i] = Math.random();
    }

    double max = array[0]; // Массив не должен быть пустым
    double min = array[0];
    double avg = 0;
    for (int i = 0; i < array.length; i++) {
        if(max < array[i])
            max = array[i];
        if(min > array[i])
            min = array[i];
        avg += array[i]/array.length;
    }

    System.out.println("максимальное = " + max);
    System.out.println("минимальное = " + min);
    System.out.println("среднее = " + avg);
}
    }