package trabalho;

// classe que representa um jogador de vava
public class JogadorValorant {

    // atributos do jogador
    String nome;
    String nick;
    String agente;
    String patente;
    int nivel;
    int idade;
    int kills;
    int deaths;
    int assists;
    double porcentagemHeadshot;

    //  construtor
    // os 5 primeiros atributos são obrigatorios
    public JogadorValorant(String nome, String nick, String agente, String patente, int nivel) {

        // guarda os valores recebidos nos atributos
        this.nome = nome;
        this.nick = nick;
        this.agente = agente;
        this.patente = patente;
        this.nivel = nivel;

        // define valores iniciais
        this.idade = 18;
        this.kills = 0;
        this.deaths = 0;
        this.assists = 0;
        this.porcentagemHeadshot = 0.0;
    }

    // metodo para registrar uma kill
    public void registrarKill() {
        kills++;
    }

    // metodo para registrar uma morte
    public void registrarMorte() {
        deaths++;
    }

    // metodo para registrar uma assistência
    public void registrarAssistencia() {
        assists++;
    }

    // metodo para mostrar as informações do jogador
    public void mostrarInformacoes() {

        System.out.println(" JOGADOR ");
        System.out.println("Nome: " + nome);
        System.out.println("Nick: " + nick);
        System.out.println("Agente: " + agente);
        System.out.println("Patente: " + patente);
        System.out.println("Nível: " + nivel);
        System.out.println("Idade: " + idade);
        System.out.println("Kills: " + kills);
        System.out.println("Mortes: " + deaths);
        System.out.println("Assistências: " + assists);
        System.out.println("Headshot: " + porcentagemHeadshot + "%");
    }
}