## 6. Discussão dos resultados

Na **busca linear**, o melhor caso acontece quando o elemento está no início do vetor, pois é feita apenas uma comparação. No caso médio, o elemento pode estar aproximadamente no meio, e no pior caso ele está no final ou nem existe, sendo necessário percorrer todo o vetor.

Na **busca binária**, o melhor caso também acontece quando o elemento está logo no meio. No caso médio e no pior caso, o vetor vai sendo dividido pela metade até encontrar o elemento ou concluir que ele não existe. Por isso, ela é bem mais eficiente em vetores ordenados.

Ao comparar a busca binária implementada com o `Arrays.binarySearch`, os tempos podem variar bastante dependendo do tamanho do vetor e do computador. A versão da biblioteca Java é otimizada, mas em testes pequenos a diferença pode ser muito pequena e até difícil de perceber.

Para um dicionário com **240.000 palavras**, na busca sequencial seriam necessárias até **240.000 etapas** no pior caso. Já na busca binária seriam aproximadamente **18 etapas**, pois `log₂(240.000) ≈ 17,87`.

De forma geral, para um vetor com `n` elementos, a busca sequencial possui complexidade **O(n)**, enquanto a busca binária possui complexidade **O(log n)**.