public class Main {
    public static void main(String[] args) {
        int salary = 29000;

        int total = 0;
        int mounth = 0;
        while (total < 2459000) {

            int interest = (total * 12 / 100) / 12; // проценты на текущую сумму
            total += 15000 + interest;
            mounth++;
            System.out.println("проценты по вкладу на каждый месяц " + interest);
            System.out.println("сумму накоплений за каждый месяц учитывая проценты на остаток " + total);
            //  System.out.println("Месяц " + l + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("итогова сумма накоплений включая проценты" + total);
        // System.out.println();
        System.out.println("количество месяцев сколько потребовалось" + mounth);

        System.out.println();

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b >= 1; b--){
            System.out.print(b+ " ");
        }
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int growth1000 = fertility - mortality;
        int growth = growth1000*12000;
        int numberFor1Year = population + growth;

        for (int i = 1; i <= 10; i++){
            numberFor1Year += growth;
            System.out.println("numberFor1Year " + numberFor1Year);
        }


    }
}