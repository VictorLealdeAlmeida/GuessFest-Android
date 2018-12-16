# IF710 - Programação para Dispositivos Móveis com Android

## Ciência da Computação, [Centro de Informática](http://www.cin.ufpe.br), ([UFPE](http://www.ufpe.br))

### Uso de Memória

Aqui analisamos como foi o uso de memória durante uma partida do GuessFest.

De forma geral, temos um uso estável da memória. 

Consumo médio

Java: ~4MB
Graphics: 8-16MB
Others: 1.4-1.7MB
Code: 23MB
Stack: 0.3MB
Native: 30-300MB

Vendo os números, notamos que o consumo de memória é definido principalmente pelo Native da aplicação/SO. O aplicativo em si consome muito pouco em termos de processamento (Code, Stack, Java) e componentes (Graphics). O consumo é mais intenso já que a CPU está consumindo mais recurso para processar todo o conteúdo e a memória fica responsável por receber e ter todo conteúdo alocado, fazendo as leituras das categorias e palavras.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/memory1.jpeg)

Como a aplicação é processada e carregada toda na memória, uma vez que ela inicia o pré-jogo, temos um custo praticamente constante de memória ao longo de uma partida. O custo médio da partida fica em torno de 308~309MB, apresentando um comportamento saudável, consumindo um percentual com uma folga signifiticativa do topo da memória. 

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/memory2.jpeg)

Nosso pico de memória total fica em torno de 354MB.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/memory3.jpeg)

Concluindo, temos um uso, durante a maior parte do uso do jogo, bastante estável de Memória, considerando temos uma aplicação de tela inteira, que não deve competir com muitos recursos simultâneos. Acredito que conseguimos fazer algumas otimizações de memória se o conteúdo do jogo, do ponto de vista de componentes gráficos, for reduzido e se tivermos uma estrutura de dados mais eficiente para leitura e escrita. No mais, ainda conseguimos ter uma experiência fluida, sem travamentos e crashes na aplicação, já que a folga de memória permitiria mais processamento.
