package ders06;

import ders06.ext.External;

public class Default {
    String DefaultMessage = "Default's default message";

    public void showMsg() {
        External external = new External();

        System.out.println(this.DefaultMessage);     // Visible. It is in same class
        System.out.println(external.defaultMessage); // Non-visible. It is not in same package.
    }
}

class DefaultSub extends Default {
    String defaultMessage = "DefaultSub's default message";

    public void showMsg() {
        System.out.println(super.DefaultMessage); // Visible. It is in different class of same package
        System.out.println(this.defaultMessage);  // Visible. It is in same class
    }
}
