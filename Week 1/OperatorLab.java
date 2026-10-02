public class OperatorLab {
    public static void main(String[] args)  {
        //Lägg övningens kod här

        //Del 1 - vad skrivs ut?
        int a = 10;
        int b = 3;

        System.out.println(a + b); //13
        System.out.println(a - b); //7
        System.out.println(a * b); //30
        System.out.println(a / b);  //3, restvärdet skrivs inte ut när man har enkelt /
        System.out.println(a % b); //1, restvärdet som blev över

        //Del 2 - remainder (%)
        int number = 17;

        System.out.println(number % 2); //skriver ut resten av 17 delat på 2

        number++; //testar med nummer 18
        System.out.println(number % 2); //skriver ut resten av 18 delat på 2

        //Frågor
        //Vad blir resultatetr?
        //Svar: 1
        //Vad händer om number ändras till 18?
        //Svar: Då blir det ingen rest och svaret blir 0.
        //Vad kan % 2 användas till?
        //Svar: Att dela något på två och få fram resten. Se om det blir någon rest.

        //Del 3 . booleanexperiment
        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1); //true, age är större än 18
        System.out.println(test2); //false, age är inte mindre än 18
        System.out.println(test3); //true, age är samma som 20
        System.out.println(test4); //false, age är inte inte 20

        //Testa sedan logiska operatorer
        boolean hasTicket = true;
        boolean isAdult = false; //testat med både true och false

        boolean allowed = hasTicket && isAdult;
        System.out.println(allowed); //allowed om både hasTicket och isAdult är sanna

        boolean allowed2 = hasTicket || isAdult;
        System.out.println(allowed2); //allowed2 om en av variablerna hasTicket eller isAdult är sann
    }
}