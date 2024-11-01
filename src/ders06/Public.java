package ders06;

import ders06.ext.External;

public class Public {
  public String publicMessage = "Public's public message.";

  public void showMsg() {
    External external = new External();

    System.out.println(publicMessage);          // Visible. It is in same class (Public)
    System.out.println(external.publicMessage); // Visible.It is not in same package.
  }
}

class PublicSub extends Public {
  public String publicMessage = "PublicSub's public message.";

  public void showMsg() {
    System.out.println(super.publicMessage); // Visible. It is in different class (Public)
    System.out.println(this.publicMessage);  // Visible. It is in same class (PublicSub)
  }
}
