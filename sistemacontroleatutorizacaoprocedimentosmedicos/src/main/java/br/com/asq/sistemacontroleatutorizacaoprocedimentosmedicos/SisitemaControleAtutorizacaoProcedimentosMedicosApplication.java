package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {SisitemaControleAtutorizacaoProcedimentosMedicosApplication.class, Jsr310JpaConverters.class})
public class SisitemaControleAtutorizacaoProcedimentosMedicosApplication /*implements CommandLineRunner */{

	/*@Autowired
	private PessoaRepository pessoaRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(SisitemaControleAtutorizacaoProcedimentosMedicosApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(15);
		pessoa.setName("Lindomar alve");
		pessoa.setSexo("Mace");
		pessoaRepository.save(pessoa);
	}*/

	/*@Bean
	public SpringLiquibase liquibase() {
		SpringLiquibase liquibase = new SpringLiquibase();
		liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
		liquibase.setDataSource(dataSource());
		return liquibase;
	}*/

}
