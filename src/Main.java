public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int a = 1000000;
        System.out.println(a);
        byte b = 120;
        System.out.println(b);
        short c = 27567;
        System.out.println(c);
        long d = 933875634L;
        System.out.println(d);
        float e = 3.14f;
        System.out.println(e);
        double f = 3.1415926535897932384626;
        System.out.println(f);
        System.out.println();

        System.out.println("Задание №2");
        float g = 27.12f;
        System.out.println(g);
        long j = 987678965549L;
        System.out.println(j);
        float k = 2.786f;
        System.out.println(k);
        short l = 569;
        System.out.println(l);
        short m = -159;
        System.out.println(m);
        short n = 27897;
        System.out.println(n);
        byte o = 67;
        System.out.println(o);
        System.out.println();

        System.out.println("Задание №3");
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short paper = 480;
        byte studentPaper = (byte) (paper / (katya + anna + luda));
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
        System.out.println();

        System.out.println("Задание №4");
        byte machinePower = 16;
        short machinePower20min = (short) (machinePower * 10);
        System.out.println("За 20 минут машина произвела " + machinePower20min + " штук бутылок");
        short machinePower1Day = (short) (machinePower20min * 72);
        System.out.println("За 1 день машина произвела " + machinePower1Day + " штук бутылок");
        int machinePower3Days = machinePower1Day * 3;
        System.out.println("За 3 дня машина произвела " + machinePower3Days + " штук бутылок");
        int machinePower1Month = machinePower3Days * 10;
        System.out.println("За 1 месяц машина произвела " + machinePower1Month + " штук бутылок");
        System.out.println();

        System.out.println("Задание №5");
        short totalPaints = 120;
        byte whitePaints = 2;
        byte brownPaints = 4;
        byte classes = (byte) (totalPaints / (whitePaints + brownPaints));
        byte totalWhitePaints = (byte) (classes * whitePaints);
        byte totalBrownPaints = (byte) (classes * brownPaints);
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " банок коричневой краски");
        System.out.println();

        System.out.println("Задание №6");
        byte bananaWeight = 80;
        byte milk100MlWeight = 105;
        byte iceСreamWeight = 100;
        byte egg = 70;
        short cocktailWeightInGrams = (short) (5 * bananaWeight + 2 * milk100MlWeight + 2 * iceСreamWeight + 4 * egg);
        System.out.println("Вес коктеля составляет " + cocktailWeightInGrams + " грамм");
        float cocktailWeightInKg = cocktailWeightInGrams / 1000f;
        System.out.println("Вес коктеля составляет " + cocktailWeightInKg + " Кг");
        System.out.println();

        System.out.println("Задание №7");
        short maximumWeightLoss = 7 * 1000;
        short weightLossPerDay1 = 250;
        short weightLossPerDay2 = 500;
        byte maximumDays1 = (byte) (maximumWeightLoss / weightLossPerDay1);
        System.out.println("В среднем потребуется " +maximumDays1 + " дней,чтобы добиться результата похудения, если худеть по 250 грамм в день");
        byte maximumDays2 = (byte) (maximumWeightLoss / weightLossPerDay2);
        System.out.println("В среднем потребуется " +maximumDays2 + " дней,чтобы добиться результата похудения, если худеть по 500 грамм в день");
        System.out.println();

        System.out.println("Задание №8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float indexing = 1.1f;
        int mashaIndex = (int) (masha * indexing);
        int denisIndex = (int) (denis * indexing);
        int kristinaIndex = (int) (kristina * indexing);
        int annualSalaryDifferenceMasha = (mashaIndex - masha) * 12;
        int annualSalaryDifferenceDenis = (denisIndex - denis) * 12;
        int annualSalaryDifferenceKristina = (kristinaIndex - kristina) * 12;
        System.out.println("Маша теперь получает " + mashaIndex + " рублей. Годовой доход вырос на " +annualSalaryDifferenceMasha+ " рублей");
        System.out.println("Денис теперь получает " + denisIndex + " рублей. Годовой доход вырос на " +annualSalaryDifferenceDenis+ " рублей");
        System.out.println("Кристина теперь получает " + kristinaIndex + " рублей. Годовой доход вырос на " +annualSalaryDifferenceKristina+ " рублей");

    }
}