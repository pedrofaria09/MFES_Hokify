package Hokify;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Hokify {
  private VDMSet utilizadores = SetUtil.set();
  private VDMSet trabalhos = SetUtil.set();

  public void cg_init_Hokify_1() {

    return;
  }

  public Hokify() {

    cg_init_Hokify_1();
  }

  public void addUtilizadores(final Utilizador utilizador) {

    utilizadores = SetUtil.union(Utils.copy(utilizadores), SetUtil.set(utilizador));
  }

  public void addTrabalhos(final Trabalho trabalho) {

    trabalhos = SetUtil.union(Utils.copy(trabalhos), SetUtil.set(trabalho));
  }

  public VDMSet getUtilizadores() {

    return Utils.copy(utilizadores);
  }

  public VDMSet getTrabalhos() {

    return Utils.copy(trabalhos);
  }

  public VDMSet getTrabalhosPorNome(final String nome) {

    VDMSet setCompResult_1 = SetUtil.set();
    VDMSet set_1 = Utils.copy(trabalhos);
    for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext(); ) {
      Trabalho trabalhos_1 = ((Trabalho) iterator_1.next());
      if (trabalhos_1.nomeSemelhante(nome)) {
        setCompResult_1.add(trabalhos_1);
      }
    }
    return Utils.copy(setCompResult_1);
  }

  public VDMSet getTrabalhosPorInteresses(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_2 = trabalhos.iterator(); iterator_2.hasNext(); ) {
      Trabalho tr = (Trabalho) iterator_2.next();
      if (SetUtil.inSet(nome, tr.getInteresses())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getTrabalhosPorSkills(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_3 = trabalhos.iterator(); iterator_3.hasNext(); ) {
      Trabalho tr = (Trabalho) iterator_3.next();
      if (SetUtil.inSet(nome, tr.getSkills())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getTrabalhosPorEscolaridade(final Object nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_4 = trabalhos.iterator(); iterator_4.hasNext(); ) {
      Trabalho tr = (Trabalho) iterator_4.next();
      if (SetUtil.inSet(nome, tr.getlistaEscolaridades())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getTrabalhosPorUtilizador(final Utilizador usr) {

    VDMSet results_escolaridade = SetUtil.set();
    VDMSet results_skills = SetUtil.set();
    VDMSet results_interesses = SetUtil.set();
    VDMSet trabalhos_temp = SetUtil.set();
    results_escolaridade = getTrabalhosPorEscolaridade(((Object) usr.getEscolaridade()));
    for (Iterator iterator_5 = usr.getSkills().iterator(); iterator_5.hasNext(); ) {
      String skill = (String) iterator_5.next();
      trabalhos_temp = getTrabalhosPorSkills(skill);
    }
    for (Iterator iterator_6 = trabalhos_temp.iterator(); iterator_6.hasNext(); ) {
      Trabalho skill_temp = (Trabalho) iterator_6.next();
      if (!(SetUtil.inSet(skill_temp, results_skills))) {
        results_skills = SetUtil.union(Utils.copy(results_skills), SetUtil.set(skill_temp));
      }
    }
    for (Iterator iterator_7 = usr.getInteresses().iterator(); iterator_7.hasNext(); ) {
      String interesse = (String) iterator_7.next();
      trabalhos_temp = getTrabalhosPorInteresses(interesse);
    }
    for (Iterator iterator_8 = trabalhos_temp.iterator(); iterator_8.hasNext(); ) {
      Trabalho interesse_temp = (Trabalho) iterator_8.next();
      if (!(SetUtil.inSet(interesse_temp, results_interesses))) {
        results_interesses =
            SetUtil.union(Utils.copy(results_interesses), SetUtil.set(interesse_temp));
      }
    }
    return SetUtil.intersect(
        SetUtil.intersect(Utils.copy(results_escolaridade), Utils.copy(results_skills)),
        Utils.copy(results_interesses));
  }

  public VDMSet getTrabalhosPorPais(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_9 = trabalhos.iterator(); iterator_9.hasNext(); ) {
      Trabalho tr = (Trabalho) iterator_9.next();
      if (Utils.equals(nome, tr.getPais())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getTrabalhosPorLocalidade(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_10 = trabalhos.iterator(); iterator_10.hasNext(); ) {
      Trabalho tr = (Trabalho) iterator_10.next();
      if (Utils.equals(nome, tr.getLocalidade())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getUtilizadoresPorInteresses(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_11 = utilizadores.iterator(); iterator_11.hasNext(); ) {
      Utilizador tr = (Utilizador) iterator_11.next();
      if (SetUtil.inSet(nome, tr.getInteresses())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getUtilizadoresPorSkills(final String nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_12 = utilizadores.iterator(); iterator_12.hasNext(); ) {
      Utilizador tr = (Utilizador) iterator_12.next();
      if (SetUtil.inSet(nome, tr.getSkills())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getUtilizadoresPorEscolaridade(final Object nome) {

    VDMSet results = SetUtil.set();
    for (Iterator iterator_13 = utilizadores.iterator(); iterator_13.hasNext(); ) {
      Utilizador tr = (Utilizador) iterator_13.next();
      if (SetUtil.inSet(nome, tr.getlistaEscolaridades())) {
        results = SetUtil.union(Utils.copy(results), SetUtil.set(tr));
      }
    }
    return Utils.copy(results);
  }

  public VDMSet getTrabalhosPorUtilizador(final Trabalho trab) {

    VDMSet results_escolaridade = SetUtil.set();
    VDMSet results_skills = SetUtil.set();
    VDMSet results_interesses = SetUtil.set();
    VDMSet utilizadores_temp = SetUtil.set();
    results_escolaridade = getUtilizadoresPorEscolaridade(((Object) trab.getEscolaridade()));
    for (Iterator iterator_14 = trab.getSkills().iterator(); iterator_14.hasNext(); ) {
      String skill = (String) iterator_14.next();
      utilizadores_temp = getUtilizadoresPorSkills(skill);
    }
    for (Iterator iterator_15 = utilizadores_temp.iterator(); iterator_15.hasNext(); ) {
      Utilizador skill_temp = (Utilizador) iterator_15.next();
      if (!(SetUtil.inSet(skill_temp, results_skills))) {
        results_skills = SetUtil.union(Utils.copy(results_skills), SetUtil.set(skill_temp));
      }
    }
    for (Iterator iterator_16 = trab.getInteresses().iterator(); iterator_16.hasNext(); ) {
      String interesse = (String) iterator_16.next();
      utilizadores_temp = getUtilizadoresPorInteresses(interesse);
    }
    for (Iterator iterator_17 = utilizadores_temp.iterator(); iterator_17.hasNext(); ) {
      Utilizador interesse_temp = (Utilizador) iterator_17.next();
      if (!(SetUtil.inSet(interesse_temp, results_interesses))) {
        results_interesses =
            SetUtil.union(Utils.copy(results_interesses), SetUtil.set(interesse_temp));
      }
    }
    return SetUtil.intersect(
        SetUtil.intersect(Utils.copy(results_escolaridade), Utils.copy(results_skills)),
        Utils.copy(results_interesses));
  }

  public Boolean sameUser(final Utilizador user) {

    for (Iterator iterator_18 = utilizadores.iterator(); iterator_18.hasNext(); ) {
      Utilizador u = (Utilizador) iterator_18.next();
      Boolean orResult_1 = false;

      if (Utils.equals(u.getEmail(), user.getEmail())) {
        orResult_1 = true;
      } else {
        orResult_1 = Utils.equals(u.getTelefone(), user.getTelefone());
      }

      if (orResult_1) {
        return false;
      }
    }
    return true;
  }

  public Boolean sameTrabalho(final Trabalho trab) {

    for (Iterator iterator_19 = trabalhos.iterator(); iterator_19.hasNext(); ) {
      Trabalho u = (Trabalho) iterator_19.next();
      Boolean orResult_2 = false;

      if (Utils.equals(u.getEmail(), trab.getEmail())) {
        orResult_2 = true;
      } else {
        Boolean orResult_3 = false;

        if (Utils.equals(u.getNome(), trab.getNome())) {
          orResult_3 = true;
        } else {
          orResult_3 = Utils.equals(u.getEntidade(), trab.getEntidade());
        }

        orResult_2 = orResult_3;
      }

      if (orResult_2) {
        return false;
      }
    }
    return true;
  }

  public String toString() {

    return "Hokify{"
        + "utilizadores := "
        + Utils.toString(utilizadores)
        + ", trabalhos := "
        + Utils.toString(trabalhos)
        + "}";
  }
}
