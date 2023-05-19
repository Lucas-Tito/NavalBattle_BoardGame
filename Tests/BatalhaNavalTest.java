// package Tests;

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;

// import BatalhaNaval;

// import java.io.ByteArrayOutputStream;
// import java.io.PrintStream;

// import static junit.framework.TestCase.assertTrue;
// import static org.junit.Assert.assertEquals;

// public class BatalhaNavalTest {
//     private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//     private final PrintStream originalOut = System.out;

//     @Before
//     public void setUpStreams() {
//         System.setOut(new PrintStream(outputStream));
//     }

//     @After
//     public void restoreStreams() {
//         System.setOut(originalOut);
//     }

//     @Test
//     public void testBatalhaNaval() {
//         BatalhaNaval.main(new String[]{});

//         // Captura a saída produzida pela classe main
//         String output = outputStream.toString();

//         // Adicione asserções para verificar se a saída está correta
//         // Por exemplo, verifique se a mensagem de vitória é exibida corretamente
//         assertTrue(output.contains("Jogo terminado. Você acertou os 3 navios"));

//         // Adicione outras asserções, se necessário, para verificar outros aspectos da saída produzida
//     }
// }