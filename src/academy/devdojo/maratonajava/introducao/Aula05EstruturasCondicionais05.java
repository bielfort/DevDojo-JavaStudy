package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Switch - print days of the week, assume that 1 is sunday.
        byte dia = 5;
        // char, int, byte, short, enum, String
        switch(dia){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Opção invalida.");
                break;

        }

        String sexo = "H";
        switch (sexo){
            case "M":
                 System.out.println("Homem");
                break;
            case "F":
                 System.out.println("Mulher");
                 break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
