import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws SQLException{
        Scanner scanner = new Scanner(System.in);

        String menu = "escolha uma opção: 1 - Inserir aluno, 2 - listar aluno(s)";
        System.out.println(menu);

        String opcao = scanner.nextLine();
        if(opcao.equals("1")){
            inserirAluno(scanner);                      
        }else if(opcao.equals("2")){
            listarAlunos(scanner);
        }
    }


    public static void inserirAluno(Scanner scanner){
        System.out.println("Digite o id do aluno");
        String id = scanner.nextLine(); 
        System.out.println("Digite o cpf do aluno");
        String cpf = scanner.nextLine();
        System.out.println("Digite a matricula do aluno");
        String matricula = scanner.nextLine(); 
        System.out.println("Digite o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do aluno");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do aluno");
        String telefone = scanner.nextLine();

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = ConnectionFactory.getConnection();
            String sql = ("insert into tabela_alunos (id, cpf, matricula, nome, email, telefone) values (?,?,?,?,?,?)");
        
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, id);
            ps.setString(2, cpf);
            ps.setString(3, matricula);
            ps.setString(4, nome);
            ps.setString(5, email);
            ps.setString(6, telefone);
            
            System.out.println("Aluno cadastrado");
            ps.executeUpdate();
            ps.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }   

    public static void listarAlunos(Scanner scanner) throws SQLException{
        try{
            Class.forName("org.postgresql.Driver");
            Connection connectio = ConnectionFactory.getConnection();String sql = ("select * from tabela_alunos");

            PreparedStatement ps = connectio.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String id = rs.getString("id");
                String cpf = rs.getString("cpf");
                String matricula = rs.getString("matricula");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                System.out.println("{Aluno: ID: " + id + ", CPF: " + cpf + ", MATRICULA: " + matricula + ", NOME: " + nome + ", EMAIL: " + email + ", TELEFONE: " + telefone + "}");
            }
            connectio.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
        
}