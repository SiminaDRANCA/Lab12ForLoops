public class LogicalOp {
    /*1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
     Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
     pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
     deoarece metoda afiseaza, nu returneaza.
     Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.*/
    public void showEmAll(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /*2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul
    primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.*/
    public void negativeShowEmAll(int number) {
        for (int i = number; i > -101; i--) {
            System.out.println(i);
        }
    }

    /*3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o
    numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
    (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.Apelati metoda in clasa Main,
    metoda main() pentru a verifica daca functioneaza. */
    public void countingInBetween(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    /*4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice
     care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai
     mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
     atunci numaratoarea sa fie de la y la x).Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public void increasingCounting(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }

        for (int j = second; j <= first; j++) {
            System.out.println(j);
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void increasingEvens() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void increasingOdds() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /*7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele
     pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in
      clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public int sumItAll(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    /*8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele
     pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa
      returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public float Average(int number) {
        float sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }

    /*9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
            *******
            ******
            *****
            ****
            ***
            **
            *
    Cateva mentiuni:
            - pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
            - prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
- semnul asterisk (*) se poate afisa sub forma de string
    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public void downwardTrianglePattern(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}