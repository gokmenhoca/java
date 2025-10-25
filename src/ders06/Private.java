package ders06;

import ders06.ext.External;

public class Private {
    private String privateMessage = "Private's private message";

    private void showMsg() {
        External external = new External();

        System.out.println(this.privateMessage);     // Visible. It is in same class (Private)
        System.out.println(external.privateMessage); // Non-visible. It is not in same package
    }
}

class PrivateSub extends Private {
    private String privateMessage = "PrivateSub's private message";

    private void showMsg() {
        System.out.println(super.privateMessage); // Non-visible. It is in a different class (Private)
        System.out.println(this.privateMessage);  // Visible. It is in same class (PrivateSub)
    }
}
