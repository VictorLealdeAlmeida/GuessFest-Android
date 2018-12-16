# IF710 - Programação para Dispositivos Móveis com Android

## Ciência da Computação, [Centro de Informática](http://www.cin.ufpe.br), ([UFPE](http://www.ufpe.br))

### Uso de bateria

Fazendo uma análise do uso de bateria ao longo da aplicação, detectamos alguns highlights. 

Inicialmente o GuessFest carrega apenas uma tela inicial, com poucos componentes e não degrada o uso de bateria. Na sequência, ao inicializar a tela de pré-jogo, vemos que o consumo cresce bastante nas primeiras interações. Os principais motivos para consumir tanta bateria é o carregamento completo das categorias e a quantidade de imagens na tela, que não receberam otimizações de tamanho. Por causa disso, o consumo passa a ficar HEAVY. Com a escolha da categoria, por volta dos 10s de uso, o conteúdo já foi totalmente carregado e o uso cai novamente para LIGHT.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/battery1.jpeg)

Dando sequência a análise vemos que o consumo de bateria fica estável durante toda a execução do jogo, já que o conteúdo foi processado e as ações durante a partida não representam custo de processamento adicional. Nesta etapa, existem poucos componentes na tela e acreditamos que não existem muitas otimizações que precisam ser feitas para melhorar a performance neste momento, já que ocorrem apenas transições de palavras, já carregadas na memória, e cores, definidas no estilo, na tela.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/battery2.jpeg)

Concluindo, vemos que a aplicação funciona na maior parte do tempo com um uso MEDIUM de bateria, tendo alguns picos do uso no carregamento do conteúdo da aplicação e na troca das principais Activities (StartGame e GameOver Activity), apresentando um gasto HEAVY de bateria. Acreditamos que podemos otimizar a aplicação mudando a forma de acessar os dados. Algumas abordagens de acesso ao banco local são mais otmizadas que a leitura de arquivos XML, como o uso de JSON. Além disso, as imagens da aplicação não foram muito otimizadas, então, toda troca de tela, carregando novos componentes, exige um custo de processamento maior, consumindo mais bateria.
