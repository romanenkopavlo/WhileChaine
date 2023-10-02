import clavier.In;

public class ChaineWhile {
    public static void main(String[] args) {
        String chaineSaisie;
        char caractereSaisie1, caractereSaisie2, caractereDeChaineSaisie;
        int numeroDeCaracteres1 = 0, numeroDeCaracteres2 = 0, laTaille;

        try {
            do {
                System.out.print("Saisissez la phrase: ");
                chaineSaisie = new String(In.readString());

                System.out.print("Saisissez le premiere caractere qui vous voulez compter dans votre phrase: ");
                caractereSaisie1 = In.readChar();

                System.out.print("Saisissez le deuxieme caractere qui vous voulez compter dans votre phrase: ");
                caractereSaisie2 = In.readChar();

                laTaille = chaineSaisie.length();

                while (laTaille > 0) {
                    caractereDeChaineSaisie = chaineSaisie.substring(laTaille - 1, laTaille).charAt(0);
                    --laTaille;
                    if (caractereDeChaineSaisie == caractereSaisie1) {
                        numeroDeCaracteres1++;
                    }
                    if (caractereDeChaineSaisie == caractereSaisie2) {
                        numeroDeCaracteres2++;
                    }
                }
                System.out.println("Le numero de " + caractereSaisie1 + ": " + numeroDeCaracteres1);
                System.out.println("Le numero de " + caractereSaisie2 + ": " + numeroDeCaracteres2);

                numeroDeCaracteres1 = 0;
                numeroDeCaracteres2 = 0;

            } while (chaineSaisie != null);
        } catch (NullPointerException exception) {
            System.out.print("Vous n'avez rien saisi");
        }
    }
}