package Hokify_quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MestradoQuote {
  private static int hc = 0;
  private static MestradoQuote instance = null;

  public MestradoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MestradoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MestradoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MestradoQuote;
  }

  public String toString() {

    return "<Mestrado>";
  }
}
