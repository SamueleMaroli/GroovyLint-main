/**
 * Classe per pensare a un numero e fare indovinare all'utente. Versione 2
 */
@CompileStatic
class ThinkOfANumber2 {

    static void main(String[] args) {
        // Genera un numero casuale tra 0 e 5
        int randomNum = new SecureRandom().nextInt(6)
        println 'The computer has chosen a number between 0 and 5. Can you guess it?'










        // Ottiene l'input dell'utente
        Scanner scanner = new Scanner(System.in)
        int userGuess = scanner.nextInt()

        // Controlla se l'indovinello è corretto
        if (userGuess == randomNum) {
            println 'Well done!'
        } else {
            println "Tough luck - you're wrong"
        }

        scanner.close() // Chiudi lo scanner per evitare perdite di risorse
    }

}
