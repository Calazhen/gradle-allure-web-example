# Exemplo a**llure report com Gradle**

Este projeto é um exemplo simples de automação web usando Selenium, Java 8, JUnit 5, Gradle e Allure Report. Ele fornece uma estrutura básica para começar a escrever testes de automação para páginas web.

## **Pré-requisitos**

- Java 8
- Gradle instalado e configurado nas variáveis de ambiente (GRADLE_HOME)
- Driver para o navegador que você deseja automatizar (geckodriver)

## **Instalação**

**Clonar o repositório:**

```powershell
git clone https://github.com/Calazhen/gradle-allure-web-example.git
```

**Navegar até o diretório do projeto:**

```powershell
cd gradle-allure-web-example
```

## **Estrutura do Projeto**

- **`\src\test\java\CareersForm.java`**: Contém os testes de automação.
- `\**src\test\allure.properties**`: Configura o caminho para salvar o relatório.

## **Executando os Testes**

Execute os testes usando o seguinte comando:

```powershell
gradle clean test
```

## **Geração do Relatório Allure**

**Gerar Relatório Allure:**
Execute o seguinte comando para gerar os relatórios do Allure:

```powershell
gradle allureReport
```

**Visualizar Relatório:**
Para visualizar o relatório no navegador, navegue até a pasta: 

**`\CareersVisualMix\build\reports\allure-report\allureReport`**.

## **Notas Importantes**
Este projeto serve como ponto de partida para a criação de projetos de automação web mais complexos. Sinta-se à vontade para personalizar conforme suas necessidades específicas.
