package Hokify;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Utilizador {
  private String nome;
  private String email;
  private Object sexo;
  private Object escolaridade;
  private Number idade;
  private Number telefone;
  private String pais;
  private String localidade;
  private VDMSet interesses = SetUtil.set();
  private VDMSet skills = SetUtil.set();
  private VDMSet listaEscolaridade = SetUtil.set();

  public void cg_init_Utilizador_1(
      final String nm,
      final String emailC,
      final Object sexoC,
      final Object escolaridadeC,
      final String paisC,
      final String localidadeC,
      final Number idadeC,
      final Number telefoneC) {

    nome = nm;
    email = emailC;
    sexo = sexoC;
    escolaridade = escolaridadeC;
    listaEscolaridades(((Object) escolaridade));
    idade = idadeC;
    telefone = telefoneC;
    pais = paisC;
    localidade = localidadeC;
    return;
  }

  public Utilizador(
      final String nm,
      final String emailC,
      final Object sexoC,
      final Object escolaridadeC,
      final String paisC,
      final String localidadeC,
      final Number idadeC,
      final Number telefoneC) {

    cg_init_Utilizador_1(nm, emailC, sexoC, escolaridadeC, paisC, localidadeC, idadeC, telefoneC);
  }

  public void listaEscolaridades(final Object tipo) {

    if (Utils.equals(tipo, Hokify_quotes.DoutoramentoQuote.getInstance())) {
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

    } else if (Utils.equals(tipo, Hokify_quotes.MestradoQuote.getInstance())) {
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

    } else if (Utils.equals(tipo, Hokify_quotes.LicenciaturaQuote.getInstance())) {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.SecundarioQuote.getInstance()));
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.LicenciaturaQuote.getInstance()));

    } else {
      listaEscolaridade =
          SetUtil.union(
              Utils.copy(listaEscolaridade),
              SetUtil.set(Hokify_quotes.SecundarioQuote.getInstance()));
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

  public Number getIdade() {

    return idade;
  }

  public Number getTelefone() {

    return telefone;
  }

  public String getEmail() {

    return email;
  }

  public Object getSexo() {

    return sexo;
  }

  public String getPais() {

    return pais;
  }

  public String getLocalidade() {

    return localidade;
  }

  public Object getEscolaridade() {

    return escolaridade;
  }

  public VDMSet getlistaEscolaridades() {

    return Utils.copy(listaEscolaridade);
  }

  public void setNome(final String newName) {

    nome = newName;
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

  public Utilizador() {}

  public String toString() {

    return "Utilizador{"
        + "nome := "
        + Utils.toString(nome)
        + ", email := "
        + Utils.toString(email)
        + ", sexo := "
        + Utils.toString(sexo)
        + ", escolaridade := "
        + Utils.toString(escolaridade)
        + ", idade := "
        + Utils.toString(idade)
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
