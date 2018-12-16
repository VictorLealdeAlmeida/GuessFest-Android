# IF710 - Programação para Dispositivos Móveis com Android

## Ciência da Computação, [Centro de Informática](http://www.cin.ufpe.br), ([UFPE](http://www.ufpe.br))

### Uso de CPU

Aqui analisamos como foi o uso de CPU durante uma partida do GuessFest.

Na tela inicial, não temos nenhum conteúdo específico que vai ser carregado, o que faz com que o uso de CPU seja constante, esperando ações do usuário.

Assim que iniciamos o pré-jogo, temos um aumento do uso de CPU. O processamento inicial é usado para carregar as informações do jogo que estão nos arquivos XML do database do jogo. Na thread do jogo, temos um pico de aproximadamente 28% do uso de CPU. Assim que o conteúdo é carregado, o uso de CPU estabiliza novamente por volta dos 24%. 

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/cpu1.jpeg)

Enquanto na troca das activities o uso de CPU cai para 0 e todo o gerenciamento ocorre na memória, o uso volta a ser constante enquanto o jogo é executado. Processamos as ações de toque do usuário na tela, trazendo novas palavras para a tela e alternando a cor do time atual da partida. Neste caso, o custo da CPU varia muito pouco, fazendo com que a aplicação não ultrapasse os 25% de uso.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/cpu2.jpeg)

Aqui vemos o momento de pico, chegando até quase 29% no carregamento da tela.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/cpu3.jpeg)

Concluindo, vemos um uso bem estável de CPU durante a aplicação, considerando que é uma aplicação de tela inteira, carregando conteúdo localmente e com vários componentes gráficos. Então, não oneramos de forma significativa a performance do device e a experiência do jogo permanece estável, sem prejudicar a experiência do usuário. Acredito que poucas otimizações podem ser feitas em termos de processamento.
