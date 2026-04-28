package exercicios.testes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


/**
 * =============================================
 * EXERCICIO 20 - MOCKITO AVANCADO + TESTES PARAMETRIZADOS
 * =============================================
 * OBJETIVO:
 * Avancar em testes automatizados com casos parametrizados e recursos mais
 * poderosos do Mockito.
 *
 * O QUE A ATIVIDADE PEDE:
 * - Crie testes parametrizados para idades invalidas, idades validas e criacao
 *   de usuarios com dados variados.
 * - Use ArgumentCaptor para inspecionar o que foi enviado ao repositorio.
 * - Verifique ordem de chamadas com InOrder.
 * - Compare mock e spy com um exemplo simples.
 * - Simule excecao com thenThrow/doThrow e resposta dinamica com thenAnswer.
 *
 * EXECUCAO:
 * - mvn test -Dtest=Ex20_MockitoAvancado
 */
@ExtendWith(MockitoExtension.class)
class Ex20_MockitoAvancado {

    @Mock
    private UsuarioRepository repository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private UsuarioService service;

    // =============================================
    // TESTES PARAMETRIZADOS
    // =============================================

    @ParameterizedTest
    @DisplayName("Deve rejeitar idades invalidas")
    @ValueSource(ints = {-1, -100, 151, 200, 999})
    void deveRejeitarIdadesInvalidas(int idade) {
        // Configure os mocks necessarios e teste cada idade
        // Cada valor do @ValueSource gera uma execucao separada do teste

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @ParameterizedTest
    @DisplayName("Deve aceitar idades validas")
    @ValueSource(ints = {0, 1, 18, 25, 100, 150})
    void deveAceitarIdadesValidas(int idade) {
        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @ParameterizedTest
    @DisplayName("Deve calcular corretamente com CsvSource")
    @CsvSource({
        "Joao, joao@email.com, 25",
        "Maria, maria@email.com, 30",
        "Pedro, pedro@email.com, 18"
    })
    void deveCriarUsuariosVariados(String nome, String email, int idade) {
        // CsvSource permite parametros multiplos

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // ARGUMENT CAPTOR
    // =============================================

    @Test
    @DisplayName("Deve capturar argumentos passados ao repository")
    void deveCapturarArgumentos() {
        // Use ArgumentCaptor para verificar EXATAMENTE o que foi passado ao mock:
        //
        // ArgumentCaptor<Usuario> captor = ArgumentCaptor.forClass(Usuario.class);
        // ... chame service.criarUsuario(...)
        // verify(repository).salvar(captor.capture());
        // Usuario capturado = captor.getValue();
        // assertEquals("Joao", capturado.getNome());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // VERIFICAR ORDEM DE CHAMADAS
    // =============================================

    @Test
    @DisplayName("Deve chamar salvar ANTES de enviar email")
    void deveRespeitarOrdem() {
        // Use InOrder para verificar a SEQUENCIA de chamadas:
        //
        // InOrder inOrder = inOrder(repository, emailService);
        // ... chame service.criarUsuario(...)
        // inOrder.verify(repository).salvar(any());      // primeiro salva
        // inOrder.verify(emailService).enviarEmail(any(), any(), any()); // depois envia email

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // SPY (objeto real com override parcial)
    // =============================================

    @Test
    @DisplayName("Deve demonstrar diferenca entre Mock e Spy")
    void deveDemonstrarSpy() {
        // Mock: TODOS os metodos retornam default
        // Spy: metodos REAIS sao chamados, mas voce pode sobrescrever especificos
        //
        // List<String> mockList = mock(ArrayList.class);
        // List<String> spyList = spy(ArrayList.class);
        //
        // mockList.add("A");  // nao adiciona nada (mock)
        // spyList.add("A");   // adiciona de verdade (spy)
        //
        // assertEquals(0, mockList.size());  // mock retorna 0
        // assertEquals(1, spyList.size());   // spy retorna 1 (real)
        //
        // doReturn(100).when(spyList).size(); // sobrescreve so o size()
        // assertEquals(100, spyList.size());  // agora retorna 100

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // doThrow (simular excecao no mock)
    // =============================================

    @Test
    @DisplayName("Deve lidar com falha ao salvar no banco")
    void deveLidarComFalhaNoRepositorio() {
        // Configure o mock para LANCAR excecao quando salvar:
        // when(repository.salvar(any())).thenThrow(new RuntimeException("Erro de conexao"));
        //
        // Verifique que a excecao propaga corretamente

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // doAnswer (resposta dinamica)
    // =============================================

    @Test
    @DisplayName("Deve usar doAnswer para resposta dinamica")
    void deveUsarDoAnswer() {
        // doAnswer permite logica customizada quando o mock eh chamado:
        //
        // when(repository.salvar(any(Usuario.class))).thenAnswer(invocation -> {
        //     Usuario u = invocation.getArgument(0);
        //     u.setId(42L);  // simula o banco gerando ID
        //     return u;
        // });
        //
        // Verifique que o usuario retornado tem id = 42

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }
}
