package Hokify_quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MasculinoQuote {
  private static int hc = 0;
  private static MasculinoQuote instance = null;

  public MasculinoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MasculinoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MasculinoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MasculinoQuote;
  }

  public String toString() {

    return "<Masculino>";
  }
}
