# GuessFest-Android

## Telas

Fluxo do jogo

1. Tela inicial
2. Tela de temas
3. Tela de seleção de times
4. Partida
5. Resultados
6. Ads

O conceito

O GuessFest segue um modelo de jogo conhecido como "hot potato" ou "batata quente", que consiste em cumprir um determinado passo e passar a "batata" (no nosso caso, o device) para o adversário. O time que terminar a partida com menos tempo acumulado segurando o dispositivo, vence.

Para este aplicativo, usamos 2 times de pelo menos 2 pessoas cada. Ou seja, é necessário, no mínimo, 4 jogadores. Cada time deverá escolher uma cor e ambos escolhem um tema. Cada tema contém um conjunto de palavras. O usuário que segura o aparelho, vê a palavra na tela e deverá dar dicas ao resto do time, sem falar a palavra ou um pedaço dela, usando somente sinônimos ou outras palavras que lembrem a que está sendo exibida. Se o time do jogador acertar a palavra, ele pode confirmar e passar o celular ao time adversário, fazendo com que o cronômetro agora conte para o outro time.

Cada partida, nesta versão, dura 20 segundos. No final de 20 segundos, o time que passar menos tempo com o celular, vence. O resultado das últimas 10 partidas pode ser visto através do Menu Inicial, caso os usuários queiram fazer um conjunto de partidas e definir quem é o vencedor de um possível campeonato que tenha mais de 1 rodada.

1. Tela inicial

Temos uma tela inicial de apresentação do jogo, que permite que o usuário veja os resultados de partidas anteriores ou inicie uma nova partida. Sem maiores complicações, o usuário pode começar a jogar.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela1.jpeg)

2. Tela de temas

Seguindo o fluxo para iniciar a partida, o usuário entra no pré-jogo, no qual deverá ver uma lista de temas em blocos. Cada tema representa um conjunto de palavras que serão apresentadas aos times durante a partida. Ainda sem saber quais são as palavras, os times devem escolher o tema.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela2.jpeg)

3. Seleção de times

Com o tema escolhido, os times podem ser definidos, ou seja, cada um escolhe a sua cor. Apenas dois times são permitidos numa partida, o Azul e o Rosa. Agora os times, com o tema já definido, podem começar a partida.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela3.jpeg)

4. Partida

Nesta etapa, com times e tema definidos, é que o jogo finalmente começa. Uma palavra aparece na tela atribuída a um time. O guardião do celular conhece a palavra e tem a missão de dar dicas para o seu próprio time. Caso o time acerte a palavra original, exatamente como está escrita, o guardião poderá aprovar a palavra e o jogo automaticamente chama uma nova palavra, atribuída ao time adversário. Este processo deverá se estender por cerca de 20 segundos até que o jogo termine e seja possível identificar o time vencedor. Caso uma palavra não seja identificada, o guardião do aparelho poderá pular e tentar uma nova palavra, fazendo com que a palavra pulada fique guardada e possa aparecer futuramente na mesma partida.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela4.jpeg)

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela5.jpeg)

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela7.jpeg)

5. Resultados

Ao final da partida, sabemos qual time foi o vencedor. Para facilitar times que desejam jogar várias partidas em sequência, criamos um histórico das últimas 10 partidas, com a data do jogo e o placar, assim como a cor do time vencedor no fundo. Este modo ajuda equipes a jogarem várias partidas em sequência, em espécie de campeonato.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela8.jpeg)

6. Ads

Pensando no crescimento da base de usuários e na proposta de fornecer um app gratuito, decidimos trabalhar a publicidade a afim de monetizar a aplicação. Identificamos o SDK da In Loco como uma das melhores formas de monetizar e ter dados de uso. Após cada fase, uma publicidade de tela inteira deverá aparecer para o usuário, caso ele esteja na área de alcance de uma campanha da In Loco.

![alt text](https://github.com/VictorLealdeAlmeida/GuessFest-Android/blob/master/Mockup/tela9.jpeg)
