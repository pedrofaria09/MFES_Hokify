package Hokify_quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DoutoramentoQuote {
  private static int hc = 0;
  private static DoutoramentoQuote instance = null;

  public DoutoramentoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static DoutoramentoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new DoutoramentoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof DoutoramentoQuote;
  }

  public String toString() {

    return "<Doutoramento>";
  }
}
