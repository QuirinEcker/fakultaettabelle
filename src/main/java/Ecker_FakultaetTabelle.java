/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: FalkutaetTabelle
 * Autoren:     Vorname Nachname
 * Version:     1.0
 * Datum:       25.11.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ausgabe einer Fakultaet Tabelle.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Ausgabe einer Fakultaet Tabelle mit zwei verschachtelten
 * Schleifen.
 *
 * ----------------------------------------------------------
*/

public class Ecker_FakultaetTabelle {

    public static void main(String[] args) {

        int number = 0;
        long fakultaet = 0;
        int multiplyer;

        System.out.println(" 0! | 1");
        for (number = 1; number < 30; number++) {
            fakultaet = number;
            for (int i = number; i > 1; i--) {
                multiplyer = (i - 1);
                fakultaet = fakultaet * multiplyer;
            }
            System.out.printf("%2d! | %d \n", number, fakultaet);
        }
    }
}
