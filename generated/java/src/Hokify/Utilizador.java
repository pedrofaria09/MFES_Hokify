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
  private Date dataNascimento;

  public void cg_init_Utilizador_1(
      final String nm,
      final String emailC,
      final Object sexoC,
      final Object escolaridadeC,
      final String paisC,
      final String localidadeC,
      final Number idadeC,
      final Number telefoneC,
      final Number year,
      final Number month,
      final Number day) {

    nome = nm;
    email = emailC;
    sexo = sexoC;
    escolaridade = escolaridadeC;
    listaEscolaridades(((Object) escolaridade));
    idade = idadeC;
    telefone = telefoneC;
    pais = paisC;
    localidade = localidadeC;
    dataNascimento = new Date(year, month, day);
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
      final Number telefoneC,
      final Number year,
      final Number month,
      final Number day) {

    cg_init_Utilizador_1(
        nm, emailC, sexoC, escolaridadeC, paisC, localidadeC, idadeC, telefoneC, year, month, day);
  }

  public Boolean verificarEscolaridade(final Object escola, final Number idd) {

    Boolean andResult_20 = false;

    if (Utils.equals(escola, Hokify_quotes.SecundarioQuote.getInstance())) {
      if (idd.longValue() > 17L) {
        andResult_20 = true;
      }
    }

    if (andResult_20) {
      return true;

    } else {
      Boolean andResult_21 = false;

      if (Utils.equals(escola, Hokify_quotes.LicenciaturaQuote.getInstance())) {
        if (idd.longValue() > 20L) {
          andResult_21 = true;
        }
      }

      if (andResult_21) {
        return true;

      } else {
        Boolean andResult_22 = false;

        if (Utils.equals(escola, Hokify_quotes.MestradoQuote.getInstance())) {
          if (idd.longValue() > 22L) {
            andResult_22 = true;
          }
        }

        if (andResult_22) {
          return true;

        } else {
          Boolean andResult_23 = false;

          if (Utils.equals(escola, Hokify_quotes.DoutoramentoQuote.getInstance())) {
            if (idd.longValue() > 24L) {
              andResult_23 = true;
            }
          }

          if (andResult_23) {
            return true;

          } else {
            return false;
          }
        }
      }
    }
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

  public Date getDataNasccimento() {

    return Utils.copy(dataNascimento);
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

  public static Number DaysOfMonth(final Number month, final Number year) {

    throw new UnsupportedOperationException();
  }

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
        + ", dataNascimento := "
        + Utils.toString(dataNascimento)
        + "}";
  }

  public static class Date implements Record {
    public Number year;
    public Number month;
    public Number day;

    public Date(final Number _year, final Number _month, final Number _day) {

      year = _year;
      month = _month;
      day = _day;
    }

    public boolean equals(final Object obj) {

      if (!(obj instanceof Date)) {
        return false;
      }

      Date other = ((Date) obj);

      return (Utils.equals(year, other.year))
          && (Utils.equals(month, other.month))
          && (Utils.equals(day, other.day));
    }

    public int hashCode() {

      return Utils.hashCode(year, month, day);
    }

    public Date copy() {

      return new Date(year, month, day);
    }

    public String toString() {

      return "mk_Utilizador`Date" + Utils.formatFields(year, month, day);
    }
  }

  public static Boolean inv_Date(final Date recordPattern_1) {

    Boolean success_1 = true;
    Number y = null;
    Number m = null;
    Number d = null;
    y = recordPattern_1.year;
    m = recordPattern_1.month;
    d = recordPattern_1.day;

    if (!(success_1)) {
      throw new RuntimeException("Record pattern match failed");
    }

    Boolean andResult_24 = false;

    if (m.longValue() <= 12L) {
      if (d.longValue() <= DaysOfMonth(m, y).longValue()) {
        andResult_24 = true;
      }
    }

    return andResult_24;
  }
}
