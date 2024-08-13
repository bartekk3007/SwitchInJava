public class Main
{
    enum PoryRoku
    {
        WIOSNA, LATO, JESIEN, ZIMA
    }

    enum DniTygodnia
    {
        PONIEDZIAŁEK, WTOREK, ŚRODA, CZWARTEK, PIĄTEK, SOBOTA, NIEDZIELA
    }

    @SuppressWarnings("fallthrough")
    public static void main(String[] args)
    {
        //switch statement (instrukcja switch)
        int statementNumber = 3;
        switch(statementNumber)
        {
            case 1 -> System.out.println("Number is 1");
            case 2 -> System.out.println("Number is 2");
            case 3 -> System.out.println("Number is 3");
            case 4, 5 -> System.out.println("Number is 4 or 5");
            default -> System.out.println("Your number is weird");
        }

        //switch experssion (wyrażenie switch)
        PoryRoku poraRoku = PoryRoku.WIOSNA;
        int liczbaRoku = switch(poraRoku)
        {
            case WIOSNA -> 1;
            case LATO -> 2;
            case JESIEN -> 3;
            case ZIMA -> 4;
        };
        System.out.println(liczbaRoku);

        //switch statement (instrukcja switch)
        switch(poraRoku)
        {
            case WIOSNA:
                System.out.println("Jest cieplo");
            case LATO:
                System.out.println("Są wakacje");
                break;
            case JESIEN:
                System.out.println("Jest zimno");
            case ZIMA:
                System.out.println("Są ferie");
                break;
        }

        //switch experssion (wyrażenie switch)
        DniTygodnia dzienTygodnia = DniTygodnia.PIĄTEK;
        int liczbaDnia = switch(dzienTygodnia)
        {
            case PONIEDZIAŁEK:
                yield 1;
            case WTOREK:
                yield 2;
            case ŚRODA:
                yield 3;
            case CZWARTEK:
                yield 4;
            case PIĄTEK:
                System.out.println("Jest piątek");
            case SOBOTA:
                yield 6;
            case NIEDZIELA:
                yield 7;
        };
        System.out.println("Liczba dnia tygodnia to: " + liczbaDnia);
        DniTygodnia dzienOrdinal = DniTygodnia.SOBOTA;
        System.out.println("Ordinal of sobota (liczone od zera) is " + dzienOrdinal.ordinal());
    }
}