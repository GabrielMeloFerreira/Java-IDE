### Segue abaixo o diagama de um iphone
Nos arquivos se encontram também a utilização de cada um

:::mermaid

classDiagram
Iphone --> Reprodutor Musical
Iphone --> Aparelho Telefonico
Iphone --> Navegador Internet

Reprodutor Musical: +Tocar
Reprodutor Musical: +Pausar
Reprodutor Musical: +Selecionar Musica(String)

Aparelho Telefonico: +Ligar(String)
Aparelho Telefonico: +Atender
Aparelho Telefonico: +Correio de Voz

Navegador Internet: +Exibir Página(String)
Navegador Internet: +Adicionar Página
Navegador Internet: +Atualizar Página

:::