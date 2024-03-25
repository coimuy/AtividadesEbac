@Tabela("usuarios")
public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "joao@email.com");
        System.out.println(usuario);

        // Obter o nome da tabela usando a anotação
        String nomeTabela = Usuario.class.getAnnotation(Tabela.class).value();
        System.out.println("Nome da tabela no banco de dados: " + nomeTabela);
    }
}
