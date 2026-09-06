## 1. Por que essa abordagem usando um array de instâncias da classe Vetor torna a busca de um contato mais rápida em comparação com a versão anterior (uma única lista contendo todos os contatos)?

Porque agora os contatos ficam separados pela primeira letra do nome. Então, quando vou buscar um contato, primeiro pego o índice da letra e vou direto no Vetor daquela letra. Assim não preciso ficar procurando em todos os contatos, só nos que começam com a mesma letra, deixando a busca mais rápida.

## 2. O que acontece com o desempenho da busca se a maioria dos contatos cadastrados começar com a mesma letra (ex: centenas de nomes iniciando com a letra "M")? O sistema continuará rápido? Justifique.

Nesse caso a busca pode ficar mais lenta, porque muitos contatos vão estar no mesmo Vetor. Se tiver centenas de contatos começando com "M", por exemplo, ainda vai ser necessário percorrer vários deles até encontrar o contato procurado. Mesmo assim, ainda é melhor que a versão anterior, porque não precisa procurar nos contatos que começam com outras letras.