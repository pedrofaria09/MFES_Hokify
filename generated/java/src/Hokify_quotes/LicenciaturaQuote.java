package Hokify_quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LicenciaturaQuote {
  private static int hc = 0;
  private static LicenciaturaQuote instance = null;

  public LicenciaturaQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static LicenciaturaQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new LicenciaturaQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof LicenciaturaQuote;
  }

  public String toString() {

    return "<Licenciatura>";
  }
}
