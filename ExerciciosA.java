public class ExerciciosA {
    public static void main(String[] args) {

        //Atividade exercitando operações 1º

        System.out.println("\n\n======Exercitando o uso do Java======\n        By SeVIIeN :)\n\n");

        double dinheiroEmReais = 451.50;
        double dollar = 5.25;
        double dinheiroEmDollar = dinheiroEmReais / dollar;

        System.out.println("O Valor em dólares é: US$ " + dinheiroEmDollar + "\n" );
        System.out.println("-----------------------------\n");

        // operações 2º

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia máxima do veículo: " + autonomiaAtual +" km\n");

        if (autonomiaAtual > distanciaViagem) {
            System.out.println("Você tem " + autonomiaAtual + "KM de autonomia, e poderá completar a viagem sem ter que abastecer\n");

        } else {
            System.out.println("Você precisará abastecer em breve!\n");
        }

        System.out.println("-----------------------------\n");

    }
}



