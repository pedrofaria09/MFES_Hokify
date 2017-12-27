package Hokify_quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SecundarioQuote {
  private static int hc = 0;
  private static SecundarioQuote instance = null;

  public SecundarioQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static SecundarioQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new SecundarioQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof SecundarioQuote;
  }

  public String toString() {

    return "<Secundario>";
  }
}
