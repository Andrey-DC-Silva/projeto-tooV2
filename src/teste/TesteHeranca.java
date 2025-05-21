package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Plano;
import modelo.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Professor p1 = new Professor();
        p1.setNome("Paulo Roberto");
        p1.setCpf("129.941.129-001");
        p1.setEspecializacao("Musculação");
        
        System.out.println(p1.exibirDados());
        
        Plano plano1 = new Plano();
        plano1.setNome("Nível Básico");
        plano1.setDescricao("Acesso à qualquer equipamento não limitado.");
        plano1.setValor(125);
        
        Plano plano2 = new Plano();
        plano2.setNome("Nível Alto");
        plano2.setDescricao("Acesso à qualquer equipamento disponível.");
        plano2.setValor(200);
        
        Convenio c1 = new Convenio();
        c1.setNome("IFSUL");
        c1.setDescricao("Parte do sistema de apoio à .");
        c1.setDesconto(12);
        
        Convenio c2 = new Convenio();
        c2.setNome("Saúde");
        c2.setDescricao("Convênio de Saúde.");
        c2.setDesconto(5);
        
        AlunoConvenio a1 = new AlunoConvenio(c1);
        a1.setNome("Maria Aguillera");
        a1.setMatricula("51815");
        a1.setDataNascimento(LocalDate.parse("10/01/2008", formato));
        a1.setDataMatricula(LocalDate.parse("10/04/2024", formato));
        a1.setPlano(plano1);
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a1);
        a1.adicionarAvaliacao(av1);
        av1.setProfessor(p1);
        
        System.out.println(a1.exibirDados());
        System.out.println("---- ");
        System.out.println(av1.exibirDados());     
        
        
        AlunoConvenio a2 = new AlunoConvenio(c2);
        a2.setNome("Maikon Douglas");
        a2.setMatricula("50413");
        a2.setDataNascimento(LocalDate.parse("10/01/2000", formato));
        a2.setDataMatricula(LocalDate.parse("10/04/2020", formato));
        
        AvaliacaoFisica av2 = new AvaliacaoFisica(a2);
        a2.adicionarAvaliacao(av2);
        av2.setProfessor(p1);
        
        System.out.println(a2.exibirDados());
        System.out.println("---- ");
        System.out.println(av2.exibirDados());  
    
    }
}
