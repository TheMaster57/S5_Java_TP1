package exercice1;

/**
 * @author Maxime BLAISE
 * @version 1.0
 */
public class PassageParRef {

    /**
     * Méthode principale.
     *
     * @param args Les arguments
     */
    public static void main(String[] args) {
        // Création d'un point
        Point p = new Point(2, 3);
        // Affichage de ses coordonnées
        System.out.println("Coordonnées du point p : " + p);
        // Changer le point
        changer(p);
        // Ré-affichage de ses coordonnées
        System.out.println("Coordonnées du point p : " + p);
    }

    /**
     * Méthode qui change l'abscisse du point à 0 Et qui change la référence du
     * point à null
     *
     * @param p Le point
     */
    public static void changer(Point p) {
        // Changement de l'abscisse à 0
        p.x = 0;
        // Change la référence du point à null
        p = null;
    }

    /**
     * Représente un point, qui contient une abscisse et une ordonnée.
     */
    static class Point {

        /**
         * Abscisse du point.
         */
        int x;

        /**
         * Ordonnées du point.
         */
        int y;

        /**
         * Construit un point en fonction de l'abscisse et de l'ordonnée.
         *
         * @param abscisse l'abscisse du point
         * @param ordonnee l'ordonnée du point
         */
        public Point(int abscisse, int ordonnee) {
            this.x = abscisse;
            this.y = ordonnee;
        }

        @Override
        public String toString() {
            return ("(" + x + ";" + y + ")");
        }
    }
}
