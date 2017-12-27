package Hokify;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestAll extends MyTestCase {
  public void TestPlayerFirst() {

    Utilizador user =
        new Utilizador(
            "Pedro",
            "email@email.com",
            Hokify_quotes.MasculinoQuote.getInstance(),
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            "Portugal",
            "Porto",
            27L,
            123456789L);
    user.addInteresse("Informatica");
    user.addInteresse("Cinema");
    user.addSkills("Java");
    user.addSkills("VDM");
    assertEqual(user.getNome(), "Pedro");
    assertEqual(user.getEmail(), "email@email.com");
    assertEqual(((Object) user.getSexo()), Hokify_quotes.MasculinoQuote.getInstance());
    assertEqual(((Object) user.getEscolaridade()), Hokify_quotes.LicenciaturaQuote.getInstance());
    assertEqual(user.getPais(), "Portugal");
    assertEqual(user.getLocalidade(), "Porto");
    assertEqual(user.getIdade(), 27L);
    assertEqual(user.getTelefone(), 123456789L);
    assertEqual(user.getInteresses(), SetUtil.set("Informatica", "Cinema"));
    assertEqual(user.getSkills(), SetUtil.set("Java", "VDM"));
    user.removeInteresse("Cinema");
    assertEqual(user.getInteresses(), SetUtil.set("Informatica"));
    user.removeSkills("VDM");
    assertEqual(user.getSkills(), SetUtil.set("Java"));
    user.setNome("Pedro Faria");
    user.setEmail("PedroFaria@gmail.com");
    user.setPais("Espanha");
    user.setLocalidade("Madrid");
    user.setEscolaridade(Hokify_quotes.MestradoQuote.getInstance());
    user.setTelefone(987654321L);
    user.setEscolaridade(Hokify_quotes.MestradoQuote.getInstance());
    assertEqual(user.getNome(), "Pedro Faria");
    assertEqual(user.getEmail(), "PedroFaria@gmail.com");
    assertEqual(user.getPais(), "Espanha");
    assertEqual(user.getLocalidade(), "Madrid");
    assertEqual(((Object) user.getEscolaridade()), Hokify_quotes.MestradoQuote.getInstance());
    assertEqual(user.getTelefone(), 987654321L);
    assertEqual(((Object) user.getEscolaridade()), Hokify_quotes.MestradoQuote.getInstance());
    return;
  }

  public void TestTrabalhoFirst() {

    Trabalho trabalho =
        new Trabalho(
            "Programador de java",
            "Google",
            "google@google.pt",
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            123456789L,
            "Portugal",
            "Porto");
    trabalho.addInteresse("Informatica");
    trabalho.addInteresse("Cinema");
    trabalho.addSkills("Java");
    trabalho.addSkills("VDM");
    assertEqual(trabalho.getNome(), "Programador de java");
    assertEqual(trabalho.getEntidade(), "Google");
    assertEqual(trabalho.getEmail(), "google@google.pt");
    assertEqual(
        ((Object) trabalho.getEscolaridade()), Hokify_quotes.LicenciaturaQuote.getInstance());
    assertEqual(trabalho.getTelefone(), 123456789L);
    assertEqual(trabalho.getPais(), "Portugal");
    assertEqual(trabalho.getLocalidade(), "Porto");
    assertEqual(trabalho.getInteresses(), SetUtil.set("Informatica", "Cinema"));
    assertEqual(trabalho.getSkills(), SetUtil.set("Java", "VDM"));
    trabalho.removeInteresse("Cinema");
    assertEqual(trabalho.getInteresses(), SetUtil.set("Informatica"));
    trabalho.removeSkills("VDM");
    assertEqual(trabalho.getSkills(), SetUtil.set("Java"));
    trabalho.setNome("Programador de C++");
    trabalho.setEntidade("apple");
    trabalho.setEmail("apple@apple.pt");
    trabalho.setPais("Espanha");
    trabalho.setLocalidade("Madrid");
    trabalho.setTelefone(987654321L);
    trabalho.setEscolaridade(Hokify_quotes.MestradoQuote.getInstance());
    assertEqual(trabalho.getNome(), "Programador de C++");
    assertEqual(trabalho.getEmail(), "apple@apple.pt");
    assertEqual(trabalho.getPais(), "Espanha");
    assertEqual(trabalho.getLocalidade(), "Madrid");
    assertEqual(trabalho.getTelefone(), 987654321L);
    assertEqual(((Object) trabalho.getEscolaridade()), Hokify_quotes.MestradoQuote.getInstance());
    return;
  }

  public void TestHokify() {

    Hokify hokify = new Hokify();
    Utilizador utilizador =
        new Utilizador(
            "Pedro",
            "email@email.com",
            Hokify_quotes.MasculinoQuote.getInstance(),
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            "Portugal",
            "Porto",
            27L,
            123456789L);
    Utilizador utilizador2 =
        new Utilizador(
            "Fabiola",
            "gmail@gmail.com",
            Hokify_quotes.FemininoQuote.getInstance(),
            Hokify_quotes.DoutoramentoQuote.getInstance(),
            "Portugal",
            "Lisboa",
            26L,
            123123123L);
    Utilizador utilizador3 =
        new Utilizador(
            "Francisca",
            "asd@asd.com",
            Hokify_quotes.FemininoQuote.getInstance(),
            Hokify_quotes.SecundarioQuote.getInstance(),
            "Portugal",
            "Lisboa",
            26L,
            123132323L);
    Utilizador sameuser =
        new Utilizador(
            "Pedro",
            "email@email.com",
            Hokify_quotes.MasculinoQuote.getInstance(),
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            "Portugal",
            "Porto",
            27L,
            123456789L);
    Trabalho trabalho =
        new Trabalho(
            "Programador de java",
            "Google",
            "google@google.pt",
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            123456789L,
            "Portugal",
            "Porto");
    Trabalho trabalho2 =
        new Trabalho(
            "Programador de c++",
            "Apple",
            "apple@apple.pt",
            Hokify_quotes.DoutoramentoQuote.getInstance(),
            4562343434L,
            "Portugal",
            "Lisboa");
    Trabalho trabalho3 =
        new Trabalho(
            "Programador de php",
            "Apple2",
            "apple2@apple.pt",
            Hokify_quotes.SecundarioQuote.getInstance(),
            357864L,
            "Portugal",
            "Funchal");
    Trabalho sametrabalho =
        new Trabalho(
            "Programador de java",
            "Google",
            "google@google.pt",
            Hokify_quotes.LicenciaturaQuote.getInstance(),
            123456789L,
            "Portugal",
            "Porto");
    hokify.addUtilizadores(utilizador);
    hokify.addTrabalhos(trabalho);
    assertEqual(hokify.getUtilizadores().size(), 1L);
    assertEqual(hokify.getTrabalhos().size(), 1L);
    hokify.addUtilizadores(utilizador2);
    hokify.addTrabalhos(trabalho2);
    assertEqual(hokify.getUtilizadores().size(), 2L);
    assertEqual(hokify.getTrabalhos().size(), 2L);
    hokify.addUtilizadores(utilizador3);
    hokify.addTrabalhos(trabalho3);
    assertTrue(!(hokify.sameUser(sameuser)));
    assertTrue(!(hokify.sameTrabalho(sametrabalho)));
    assertEqual(
        hokify.getTrabalhosPorNome("Programador"), SetUtil.set(trabalho, trabalho2, trabalho3));
    assertEqual(hokify.getTrabalhosPorNome("java"), SetUtil.set(trabalho));
    assertEqual(hokify.getTrabalhosPorNome("c++"), SetUtil.set(trabalho2));
    trabalho.addInteresse("Informatica");
    trabalho.addInteresse("Cinema");
    assertEqual(hokify.getTrabalhosPorInteresses("Informatica"), SetUtil.set(trabalho));
    assertEqual(hokify.getTrabalhosPorInteresses("Cinema"), SetUtil.set(trabalho));
    assertTrue(!(Utils.equals(hokify.getTrabalhosPorInteresses("Cinema"), SetUtil.set(trabalho2))));
    trabalho.addSkills("Java");
    trabalho.addSkills("VDM");
    assertEqual(hokify.getTrabalhosPorSkills("Java"), SetUtil.set(trabalho));
    assertEqual(hokify.getTrabalhosPorSkills("VDM"), SetUtil.set(trabalho));
    assertTrue(!(Utils.equals(hokify.getTrabalhosPorSkills("Java"), SetUtil.set(trabalho2))));
    assertEqual(hokify.getTrabalhosPorLocalidade("Porto"), SetUtil.set(trabalho));
    assertEqual(hokify.getTrabalhosPorLocalidade("Lisboa"), SetUtil.set(trabalho2));
    assertEqual(
        hokify.getTrabalhosPorPais("Portugal"), SetUtil.set(trabalho, trabalho2, trabalho3));
    assertEqual(
        hokify.getTrabalhosPorEscolaridade(Hokify_quotes.SecundarioQuote.getInstance()),
        SetUtil.set(trabalho3));
    assertEqual(
        hokify.getTrabalhosPorEscolaridade(Hokify_quotes.LicenciaturaQuote.getInstance()),
        SetUtil.set(trabalho, trabalho3));
    assertEqual(
        hokify.getTrabalhosPorEscolaridade(Hokify_quotes.MestradoQuote.getInstance()),
        SetUtil.set(trabalho, trabalho3));
    assertEqual(
        hokify.getTrabalhosPorEscolaridade(Hokify_quotes.DoutoramentoQuote.getInstance()),
        SetUtil.set(trabalho, trabalho2, trabalho3));
    utilizador.addInteresse("Informatica");
    utilizador.addInteresse("Cinema");
    utilizador.addSkills("Java");
    utilizador.addSkills("VDM");
    assertEqual(hokify.getTrabalhosPorUtilizador(utilizador), SetUtil.set(trabalho));
    utilizador2.addInteresse("Informatica");
    utilizador2.addInteresse("Cinema");
    utilizador2.addSkills("Java");
    utilizador2.addSkills("VDM");
    assertEqual(hokify.getTrabalhosPorUtilizador(utilizador2), SetUtil.set(trabalho));
    assertEqual(
        hokify.getUtilizadoresPorInteresses("Informatica"), SetUtil.set(utilizador, utilizador2));
    utilizador2.removeInteresse("Cinema");
    assertEqual(hokify.getUtilizadoresPorInteresses("Cinema"), SetUtil.set(utilizador));
    assertTrue(!(Utils.empty(hokify.getUtilizadoresPorInteresses("Cinema"))));
    assertEqual(hokify.getUtilizadoresPorSkills("Java"), SetUtil.set(utilizador, utilizador2));
    utilizador2.removeSkills("VDM");
    assertEqual(hokify.getUtilizadoresPorSkills("VDM"), SetUtil.set(utilizador));
    assertTrue(!(Utils.empty(hokify.getUtilizadoresPorSkills("VDM"))));
    assertEqual(
        hokify.getUtilizadoresPorEscolaridade(Hokify_quotes.SecundarioQuote.getInstance()),
        SetUtil.set(utilizador, utilizador2, utilizador3));
    assertEqual(
        hokify.getUtilizadoresPorEscolaridade(Hokify_quotes.LicenciaturaQuote.getInstance()),
        SetUtil.set(utilizador, utilizador2));
    assertEqual(
        hokify.getUtilizadoresPorEscolaridade(Hokify_quotes.MestradoQuote.getInstance()),
        SetUtil.set(utilizador2));
    assertEqual(
        hokify.getUtilizadoresPorEscolaridade(Hokify_quotes.DoutoramentoQuote.getInstance()),
        SetUtil.set(utilizador2));
    assertEqual(hokify.getTrabalhosPorUtilizador(trabalho), SetUtil.set(utilizador));
    utilizador2.addInteresse("Cinema");
    utilizador2.addSkills("VDM");
    assertEqual(hokify.getTrabalhosPorUtilizador(trabalho), SetUtil.set(utilizador, utilizador2));
    return;
  }

  public static void main(String[] args) {

    IO.print("TestPlayerFirst -> ");
    new TestAll().TestPlayerFirst();
    IO.println("Passed");
    IO.print("TestTrabalhoFirst -> ");
    new TestAll().TestTrabalhoFirst();
    IO.println("Passed");
    IO.print("TestHokify -> ");
    new TestAll().TestHokify();
    IO.println("Passed");
  }

  public TestAll() {}

  public String toString() {

    return "TestAll{}";
  }
}
