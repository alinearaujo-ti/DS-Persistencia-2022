<h2> Lista de exercicios 04 <h2>
<h3> Tópico - Serialização e Deserialização <h3>

Esta lista tem alguma semelhança com a Lista 03.
No entanto, o que muda é que ao invés de usar a serialização nativa do Java, vamos realizar uma serialização mais genérica usando XML através da biblioteca Jackson.

<h4> Questão 1. </h4>
  <p> Crie uma classe Java de entidade. Exemplo: Filme (id, titulo, sinopse, diretor).
         - OBS: A classe não precisa implementar a interface java.io.Serializable. </p>

<h4> Questão 2. </h4>
  <p> Crie uma classe Java de nome Serializa para instanciar objetos da classe definida na Questão 1 e adicionar esses objetos em uma Lista. Depois, percorrer a lista e Serializar os objetos em disco/ssd. Serialize usando XML através da biblioteca Jackson (XML Serialization and Deserialization with Jackson | Baeldung).
</p>
  
<h4> Questão 3. </h4>
  <p> Crie uma classe java de nome Desserializa para ler / desserializar os objetos Serializados na Questão 2 e exibi-los também através do uso da bilbioteca Jackson (XML Serialization and Deserialization with Jackson | Baeldung). </p>
