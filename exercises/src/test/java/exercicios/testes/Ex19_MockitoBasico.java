package exercicios.testes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * =============================================
 * EXERCICIO 19 - MOCKITO
 * =============================================
 * OBJETIVO:
 * Testar UsuarioService isolando UsuarioRepository e EmailService com Mockito.
 *
 * O QUE A ATIVIDADE PEDE:
 * - Configure mocks com when().thenReturn() para cenarios de sucesso e falha.
 * - Valide criacao de usuario, email invalido, email duplicado, busca por id,
 *   atualizacao de email e exclusao.
 * - Use verify() para confirmar interacoes esperadas e never()/times() quando
 *   fizer sentido.
 * - Use ArgumentCaptor ao verificar o email de boas-vindas.
 *
 * EXECUCAO:
 * - mvn test -Dtest=Ex19_MockitoBasico
 */
@ExtendWith(MockitoExtension.class)
class Ex19_MockitoBasico {

    @Mock
    private UsuarioRepository repository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private UsuarioService service;

    // =============================================
    // TESTES DE criarUsuario()
    // =============================================

    @Test
    @DisplayName("Deve criar usuario com sucesso")
    void deveCriarUsuario() {
        // ARRANGE: configure os mocks
        // when(emailService.emailValido("joao@email.com")).thenReturn(true);
        // when(repository.existePorEmail("joao@email.com")).thenReturn(false);
        // when(repository.salvar(any(Usuario.class))).thenReturn(new Usuario(1L, "Joao", "joao@email.com", 25));

        // ACT: chame o metodo
        // Usuario resultado = service.criarUsuario("Joao", "joao@email.com", 25);

        // ASSERT: verifique o resultado
        // assertNotNull(resultado);
        // assertEquals("Joao", resultado.getNome());

        // VERIFY: confirme que os mocks foram chamados
        // verify(repository).salvar(any(Usuario.class));
        // verify(emailService).enviarEmail(eq("joao@email.com"), anyString(), anyString());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao quando nome eh vazio")
    void deveLancarExcecaoNomeVazio() {
        // Nao precisa configurar mocks - a validacao acontece ANTES

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao quando email eh invalido")
    void deveLancarExcecaoEmailInvalido() {
        // Configure: when(emailService.emailValido("invalido")).thenReturn(false);
        // Verifique que repository.salvar() NUNCA foi chamado: verify(repository, never()).salvar(any());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao quando email ja existe")
    void deveLancarExcecaoEmailDuplicado() {
        // Configure emailValido -> true, existePorEmail -> true

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve verificar que email de boas-vindas foi enviado")
    void deveEnviarEmailBoasVindas() {
        // Crie usuario e use verify() para confirmar que enviarEmail foi chamado
        // Use ArgumentCaptor para capturar os argumentos passados ao enviarEmail:
        //
        // ArgumentCaptor<String> assuntoCaptor = ArgumentCaptor.forClass(String.class);
        // verify(emailService).enviarEmail(eq("joao@email.com"), assuntoCaptor.capture(), anyString());
        // assertEquals("Bem-vindo!", assuntoCaptor.getValue());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // TESTES DE buscarPorId()
    // =============================================

    @Test
    @DisplayName("Deve buscar usuario por ID")
    void deveBuscarPorId() {
        // Configure: when(repository.buscarPorId(1L)).thenReturn(Optional.of(usuario));

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao quando usuario nao encontrado")
    void deveLancarExcecaoUsuarioNaoEncontrado() {
        // Configure: when(repository.buscarPorId(99L)).thenReturn(Optional.empty());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // TESTES DE atualizarEmail()
    // =============================================

    @Test
    @DisplayName("Deve atualizar email com sucesso")
    void deveAtualizarEmail() {
        // Configure buscarPorId retornando usuario, emailValido -> true, existePorEmail -> false

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // =============================================
    // TESTES DE deletarUsuario()
    // =============================================

    @Test
    @DisplayName("Deve deletar usuario existente")
    void deveDeletarUsuario() {
        // Configure buscarPorId retornando usuario
        // Verifique que repository.deletar(1L) foi chamado exatamente 1 vez:
        // verify(repository, times(1)).deletar(1L);

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao ao deletar usuario inexistente")
    void deveLancarExcecaoAoDeletar() {
        // Configure buscarPorId retornando Optional.empty()
        // Verifique que deletar NUNCA foi chamado:
        // verify(repository, never()).deletar(anyLong());

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }
}
