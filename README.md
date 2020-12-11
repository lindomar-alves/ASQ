# ASQ
Controle de Autorizações de Procedimentos Médicos

Passo para rodar o projeto
 - Faça o clone do projeto.
 - Estando na pasta da aplicação "sistemacontroleatutorizacaoprocedimentosmedicos" execute os passos abaixo:
 
     1 - Faça o build do projeto com o comando -> mvn clean install
     
     2 - Criar imagem da aplicação execute o comando -> docker build -t sistemacontroleatutorizacaoprocedimentosmedicos .
     
     3 - Para rodar a aplicação -> docker run -p 8080:8080 sisitemacontroleatutorizacaoprocedimentosmedicos
     

Para acesso a base em memoria
   Acesse: http://localhost:8080/h2-console
   login: sa
   password: 
   no item JDBC URL adicione o seguinte conteudo =  jdbc:h2:mem:testdb
   
Para acesso aos endpoints

  - Consulta metodo GET:
      http://localhost:8080/autorizador/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}
      
  - Cadastro metodo POST:
      http://localhost:8080/autorizador/cadastro/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}/autoriza/{autoriza}
      
  OBS: as palavras que estão entre {} deverão ser substituida por valores, por exemplo http://localhost:8080/autorizador/procedimento/1234/idade/10/sexo/M


