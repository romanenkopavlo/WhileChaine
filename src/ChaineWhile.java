import clavier.In;

public class ChaineWhile {
    public static void main(String[] args) {
        String chaineSaisie = null;
        char caractereSaisie;
        int numeroDeCaracteres = 0; int laTaille = 0;

        do {
            System.out.print("Saisissez la phrase: ");
            chaineSaisie = new String(In.readString());

            System.out.print("Saisissez le caractere qui vous voulez compter dans votre phrase: ");
            caractereSaisie = In.readChar();

            laTaille = chaineSaisie.length();

//            while (laTaille != 0) {
//
//            }
        } while (chaineSaisie != null);




    }
}
