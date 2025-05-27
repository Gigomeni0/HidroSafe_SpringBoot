README – Integração Front-end React Native com o Backend HidroSafe
Este documento detalha passo a passo como estruturar, configurar e codificar o seu aplicativo React Native para comunicar-se corretamente com o backend Spring Boot HidroSafe. Ele foi escrito de forma a ser interpretado por outra IA ou por desenvolvedores, garantindo máxima compatibilidade e clareza.
<hr></hr>
1. Estrutura Geral do Projeto
Pasta raiz:
/src
/api → configuração de cliente HTTP
/models → interfaces TypeScript que espelham os DTOs do backend
/services → funções que fazem chamadas REST
/hooks → hooks de reuso (ex.: useFetchDados, useInterval)
/screens → telas do app (Monitoramento, Histórico, Alertas, Controle)
/components→ componentes UI reutilizáveis (Cartão de Evento, Lista de Alertas, etc.)
/navigation→ configuração de navegação (React Navigation)
App.tsx → ponto de entrada
.env → variáveis de ambiente (API_BASE_URL, TIMEOUT, etc.)
<hr></hr>
2. Instalação e Setup Inicial
Clone o repositório front-end e execute: