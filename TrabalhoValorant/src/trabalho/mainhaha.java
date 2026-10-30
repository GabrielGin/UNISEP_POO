package trabalho;

// classe principal do programa
public class mainhaha {

    // metodo principal, onde o programa começa
    public static void main(String[] args) {

        // criação do objeto jogador
        JogadorValorant jogador = new JogadorValorant(
            "Francesco",   // Nome
            "Checo09",   // Nick
            "Jett",      // Agente
            "prata 2",   // Patente
            120          // Nível
        );

        // registra 1 kills
        jogador.registrarKill();
   

        // registra 10 mortes
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        jogador.registrarMorte();
        
        // registra 1 assistência
        jogador.registrarAssistencia();

        // mostra as informaçoes do jogador
        jogador.mostrarInformacoes();
    }
}