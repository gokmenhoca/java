package ders06;

import ders06.ext.External;

public class Protected {
    protected String protectedMessage = "Protected's protected message";

    public void showMsg() {
        External external = new External();

        System.out.println(protectedMessage);          // Visible. It is in same class (Protected)
        System.out.println(external.protectedMessage); // Non-visible. It is not in same package.
    }
}

class ProtectedSub extends Protected {
    protected String protectedMessage = "ProtectedSub's protected message";

    public void showMsg() {
        System.out.println(this.protectedMessage);  // Visible. It is in another class of same package
        System.out.println(super.protectedMessage); // Visible. It is in same class of same package
    }
}
