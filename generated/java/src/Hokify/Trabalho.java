package Hokify;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Trabalho {
  private String nome;
  private String entidade;
  private String email;
  private Object escolaridade;
  private Number telefone;
  private String pais;
  private String localidade;
  private VDMSet interesses = SetUtil.set();
  private VDMSet skills = SetUtil.set();
  private VDMSet listaEscolaridade = SetUtil.set();

  public void cg_init_Trabalho_1(
      final String nomeC,
      final String entidadeC,
      final String emailC,
      final Object escolaridadeC,
      final Number telefoneC,
      final String paisC,
      final String localidadeC) {

    nome = nomeC;
    entidade = entidadeC;
    email = emailC;
    escolaridade = escolaridadeC;
    listaEscolaridades(((Object) escolaridade));
    telefone = telefoneC;
    pais = paisC;
    localidade = localidadeC;
    return;
  }

  public Trabalho(
      final String nomeC,
      final String entidadeC,
      final String emailC,
      final Object escolaridadeC,
      final Number telefoneC,
      final String paisC,
      final String localidadeC) {

    cg_init_Trabalho_1(nomeC, entidadeC, emailC, escolaridadeC, telefoneC, paisC, localidadeC);
  }

  public void listaEscolaridades(final Object tipo) {

    if (Utils.equals(tipo, Hokify_quotes.SecundarioQuote.getInstance())) {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.SecundarioQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.LicenciaturaQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.MestradoQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.DoutoramentoQuote.getInstance()));

    } else if (Utils.equals(tipo, Hokify_quotes.LicenciaturaQuote.getInstance())) {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.LicenciaturaQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.MestradoQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.DoutoramentoQuote.getInstance()));

    } else if (Utils.equals(tipo, Hokify_quotes.MestradoQuote.getInstance())) {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.MestradoQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.DoutoramentoQuote.getInstance()));

    } else {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.DoutoramentoQuote.getInstance()));
    }
  }

  public void addInteresse(final String String) {

    interesses = SetUtil.union(Utils.copy(interesses), SetUtil.set(String));
  }

  public void removeInteresse(final String String) {

    interesses = SetUtil.diff(Utils.copy(interesses), SetUtil.set(String));
  }

  public VDMSet getInteresses() {

    return Utils.copy(interesses);
  }

  public void addSkills(final String String) {

    skills = SetUtil.union(Utils.copy(skills), SetUtil.set(String));
  }

  public void removeSkills(final String String) {

    skills = SetUtil.diff(Utils.copy(skills), SetUtil.set(String));
  }

  public VDMSet getSkills() {

    return Utils.copy(skills);
  }

  public String getNome() {

    return nome;
  }

  public String getEntidade() {

    return entidade;
  }

  public String getEmail() {

    return email;
  }

  public Object getEscolaridade() {

    return escolaridade;
  }

  public Number getTelefone() {

    return telefone;
  }

  public String getPais() {

    return pais;
  }

  public String getLocalidade() {

    return localidade;
  }

  public VDMSet getlistaEscolaridades() {

    return Utils.copy(listaEscolaridade);
  }

  public void setNome(final String newName) {

    nome = newName;
  }

  public void setEntidade(final String newEntidade) {

    entidade = newEntidade;
  }

  public void setEmail(final String newEmail) {

    email = newEmail;
  }

  public void setTelefone(final Number newTelefone) {

    telefone = newTelefone;
  }

  public void setPais(final String newPais) {

    pais = newPais;
  }

  public void setLocalidade(final String newLocalidade) {

    localidade = newLocalidade;
  }

  public void setEscolaridade(final Object newEscolaridade) {

    escolaridade = newEscolaridade;
  }

  public Boolean nomeSemelhante(final String n) {

    String nameS = nome;
    Boolean found = false;
    Boolean whileCond_1 = true;
    while (whileCond_1) {
      Boolean andResult_10 = false;

      if (nameS.length() >= n.length()) {
        if (!(found)) {
          andResult_10 = true;
        }
      }

      whileCond_1 = andResult_10;

      if (!(whileCond_1)) {
        break;
      }

      {
        found = true;
        long toVar_1 = n.length();

        for (Long index = 1L; index <= toVar_1; index++) {
          Boolean andResult_11 = false;

          if (found) {
            if (!(Utils.equals(n.charAt(Utils.index(index)), nameS.charAt(Utils.index(index))))) {
              andResult_11 = true;
            }
          }

          if (andResult_11) {
            found = false;
          }
        }
        if (found) {
          return true;

        } else {
          nameS = SeqUtil.tail(nameS);
          found = false;
        }
      }
    }

    return false;
  }

  public Trabalho() {}

  public String toString() {

    return "Trabalho{"
        + "nome := "
        + Utils.toString(nome)
        + ", entidade := "
        + Utils.toString(entidade)
        + ", email := "
        + Utils.toString(email)
        + ", escolaridade := "
        + Utils.toString(escolaridade)
        + ", telefone := "
        + Utils.toString(telefone)
        + ", pais := "
        + Utils.toString(pais)
        + ", localidade := "
        + Utils.toString(localidade)
        + ", interesses := "
        + Utils.toString(interesses)
        + ", skills := "
        + Utils.toString(skills)
        + ", listaEscolaridade := "
        + Utils.toString(listaEscolaridade)
        + "}";
  }
}
