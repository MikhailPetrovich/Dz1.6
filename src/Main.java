public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
       // task1();
       // task2();
       // task3();
        task4();
    }

    public static void task1() {
        var salaries = generateRandomArray();
        int sum = 0;
        for (var salary : salaries) {
            sum += salary;
        }
        System.out.printf("Сумма за три месяца составила %d рублей", sum);
    }

    public static void task2() {
        var salaries = generateRandomArray();
        int max = salaries[0];
        int min = salaries[0];

        for (var salary : salaries) {
            if (max < salary) {
                max = salary;
            }
            if (min > salary) {
                min = salary;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);
    }
    public static void task3(){
        var salaries = generateRandomArray();
        int sum = 0;
        for (var salary : salaries){
            sum += salary;
        }
        var result =(double) sum/salaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", result);
    }

    public static void task4(){
      char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
      for (int i = reverseFullName.length - 1 ; i >=0 ; i--) {
          System.out.print(reverseFullName[i]);
      }
    }



}

