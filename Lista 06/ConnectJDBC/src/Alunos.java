public class Alunos {
    private int id;
    private String cpf;
    private int matricula;
    private String nome;
    private String email;
    private String telefone;

    public Alunos(){}

    public Alunos(int id, String cpf, int matricula, String nome, String email, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Alunos [id=" + id + ", cpf=" + cpf + ", matricula=" + matricula + ", nome=" + nome + ", email=" + email
                + ", telefone=" + telefone + "]";
    }

    
    
    
}
