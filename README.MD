###Análise e Desenvolvimento de Sistemas Ciência da Computação Sistemas de Informação
  
###2018/2 Trabalho 1 GB (1,0)
**Est. Avançada I Prof. Gilberto Irajá Müller**

##Contexto
O grupo deverá desenvolver uma análise comparativa dos métodos de ordenação apresentados em aula. Deverá ser gerado quatro cenários conforme exemplo ilustrativo abaixo de um dos cenários.


| n | Bubble | Insertion | Selection | Heap | Shell | Merge | Quick |
|---|---|---|---|---|---|---|---|
| 128 | 14.042 | 13.196 | 307.318 | 5.464 | 5.748 | 45.687 | 554.155 |
| 256 | 11.491 | 14.956 | 323.043 | 10.834 | 133.879 | 1.177 | 186.785 |
| 512 | 28.356 | 44.739 | 4.603.608 | 22.122 | 194.076 | 8.500 | 99.574 |
| 1024 | 113.427 | 98.640 | 439.217 | 74.358 | 1.851.860 | 6.500 | 13.188 |
| 2048 | 80.969 | 1.200 | 1.693.510 | 58.305 | 279.923 | 4.035 | 15.900 |
| 4096 | 208.695 | 282.330 | 7.489.826 | 157.626 | 794.639 | 619 | 5.240 |
| 8192 | 86.451 | 242.529 | 27.209.617 | 22.343 | 233.211 | 7.635 | 25.000 |
| 16384 | 238.433 | 496.605 | 116.392.049 | 4.004 | 933.981 | 119.758 | 6.900 |
| 32768 | 65.431 | 596.232 | 503.235.187 | 13.664 | 350.444 | 136.604 | 139.596 |
| 65536 | 167.772 | 285.453 | 2.008.199.864| 30.266 | 12.222 | 33.907 | 35.921 |

**Observe que a tabela acima refere-se ao cenário ascendente do array e, os números em verde, correspondem ao melhor desempenho.**

##Por onde começar?
Primeiramente, deverá ser gerado os quatro cenários, são eles: 
1 - Ascendente: no array terá chaves únicas em ordem crescente;
2 - Descendente: no array terá chaves decrescente;
3 - Aleatória: no array terá chaves aleatoriamente;
distribuídas Sugere-se a repetição de chaves na proporção de 5% sobre o “n”. Ex.: considerando o tamanho 128 da amostra, para cada chave terá mais 6 repetidas. Curiosidade: após a ordenação deste cenário, ficará uma “escadinha”.
Após a geração dos cenários (em memória ou em arquivo), deverá ser analisado para cada método de ordenação e tamanho “n” do array (primeira coluna da tabela), observando que os métodos devem receber o mesmo array original. Observa-se que o tempo de processamento deverá ser computado em nanossegundos.
4 - Aleatória repetida: no array terá aleatoriamente e com valores repetidos.
  únicas
únicas
em ordem
distribuídas
chaves
  1/3
 
       Análise e Desenvolvimento de Sistemas Ciência da Computação Sistemas de Informação
  2018/2 Trabalho 1 GB (1,0)
Est. Avançada I
       Prof. Gilberto Irajá Müller
     Regra Importante para Computar o Tempo
Deverá ser realizado 10 execuções armazenando o tempo de processamento de cada cenário, método e tamanho de array. A partir daí, calcula-se a média destas 10 execuções. Feito isso, calcula-se com base nestas 10 execuções a variância da amostra e, consequentemente, o desvio padrão. Com base no desvio padrão, será desconsiderado os tempos destas 10 execuções que estejam
fora da média  desvio padrão. Por fim, calcula-se o tempo médio somente dos valores que estiverem dentro desta faixa. Vamos ao exemplo?
 27633
 16974
 30396
  24081
 23686
  13816
 23291
  21317
 39081
    25264
Suponha que após 10 execuções para o cenário, método de ordenação e tamanho do array, geraram os tempos acima em nanossegundos. Abaixo, mostram-se os passos para chegarmos à media final.
  Cálculo da média
  Média: 24553.9
 Cálculo da variância
     Variância: 48995397
   2/3
 
       Análise e Desenvolvimento de Sistemas Ciência da Computação Sistemas de Informação
  2018/2 Trabalho 1 GB (1,0)
Est. Avançada I
       Prof. Gilberto Irajá Müller
   Cálculo do desvio padrão
      Desvio padrão: 6999.67
 Com base no cálculo do desvio padrão será verificado novamente os 10 tempos computados e recalculado a média para somente os
tempos que estiverem no intervalo (inclusive) média  desvio padrão. A tabela abaixo mostra em verde somente os elementos que ficaram dentro deste intervalo.
 27633
 16974
  30396
 24081
 23686
  13816
  23291
 21317
 39081
    25264
A média que será computada e colocada na tabela final para o cenário, método e tamanho do array será de: 25095 (arredondado) = (27633 + 30396 + 24081 + 23686 + 23291 + 21317 + 25264) / 7.
Avaliação
 Comentários nos métodos e código o mais claro possível;
 Não será aceito a entrega (via Moodle) do trabalho após a
data limite;
 Postar apenas as classes desenvolvidos (*.java) – não
colocar o projeto;
 Postar em PDF as quatro tabelas geradas com a cor verde no
melhor desempenho para o tamanho n;
 Colocar no cabeçalho da classe e no PDF o número do grupo e
     o nome completo dos integrantes;
 Apenas um integrante do grupo deverá postar o trabalho no Moodle;
 Não será aceito trabalho igual ao de outros colegas. Esta prática é chamada de plágio.
      3/3
