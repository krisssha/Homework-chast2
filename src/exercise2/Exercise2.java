package exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        int initialAmount = 15000;//зарплата
        int accumulation = 15000;

        for (int mounth = 0; accumulation <= 2_000_0000; mounth++) {
            accumulation += (int) (accumulation * 0.07) + initialAmount;
            if (mounth % 6 == 0) {
                System.out.println(mounth + " месяц " + " накопления с учетом 7% " + accumulation);
            }



                }
        System.out.println("______________________________________________");

        int salary = 15000;
        int depositFor1mounth = 15000;
        int nineYears  = 108;
        for (int mounth1 = 0; mounth1 <= 108; mounth1++ ) {
            depositFor1mounth += (int) (depositFor1mounth * 0.07) + salary;
            if (mounth1 % 6 == 0){
                System.out.println(mounth1 + " месяц " + " накопленная сумма " + depositFor1mounth);
            }
        }
        System.out.println("______________________________________________");

        int fridayNumber = 4;
        for (int m = 4; m <= 31; m += 7) {

                System.out.println("Сегодня пятница, " + m + "-е число. Необходимо подготовить отчет.");

        }
        System.out.println("_________________________________________________");
        int startYear = 1800;
        int endYear = 2100;
        while (startYear <= endYear) {
            startYear++;
            if (startYear % 79 == 0){
                System.out.println(startYear);
            }
        }
        System.out.println("_____________________--");

        int t = 2;
        for(int i = 0; i<=10; i++){
            System.out.println(t + " * " + i + " = "
                    + t * i);
        }
    }
}
