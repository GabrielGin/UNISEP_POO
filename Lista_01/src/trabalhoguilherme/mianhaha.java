public class mainhaha {

    // Método principal, onde o programa começa
    public static void main(String[] args) {

        // Criação do objeto jogador
        jogadorvalorant jogador = new jogadorvalorant(
            "Gabriel",   // Nome
            "Galileu",   // Nick
            "Jett",      // Agente
            "Prata 3",   // Patente
            120          // Nível
        );

        // Registra 3 kills para o jogador
        jogador.registrarKill();
        jogador.registrarKill();
        jogador.registrarKill();

        // Registra 1 morte
        jogador.registrarMorte();

        // Registra 1 assistência
        jogador.registrarAssistencia();

        // Mostra todas as informações do jogador
        jogador.mostrarInformacoes();
    }
}