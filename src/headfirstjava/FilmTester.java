package headfirstjava;


public class FilmTester {
    public static void main(String[] args) {


        Film pierwszy = new Film();
        pierwszy.tytul = "Przemin??o z hoss?";
        pierwszy.rodzaj = "Tragedia";
        pierwszy.ocena = -2;
        Film drugi = new Film();
        drugi.tytul = "Matrix dla zuchwa?ych";
        drugi.rodzaj = "Komedia";
        drugi.ocena = 5;
        drugi.odtworz();
        Film trzeci = new Film();
        trzeci.tytul = "Byte Club";
        trzeci.rodzaj = "Tragedia, ale o wyd?wi?ku optymistycznym";
        trzeci.ocena = 127;
    }
}
