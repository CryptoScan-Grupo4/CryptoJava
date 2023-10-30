
import Computador.Componente;
import Conexao.Conexao;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import login.Funcionario;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class TesteLooca {
    public static void main(String[] args) {
        Looca looca = new Looca();
        Conexao conexao = new Conexao();
        Sistema sistema = new Sistema();
        JdbcTemplate sql = conexao.getConexaoDoBanco();

        List<Componente> componentesDoBanco = sql.query("SELECT * FROM Componente" ,
                new BeanPropertyRowMapper<>(Componente.class));
        System.out.println(componentesDoBanco);

        List<Funcionario> funcionariosDoBanco = sql.query("SELECT * FROM Funcionario" ,
                new BeanPropertyRowMapper<>(Funcionario.class));

        System.out.println(funcionariosDoBanco);


    }
}
