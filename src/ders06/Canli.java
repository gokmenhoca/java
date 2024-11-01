package ders06;

public class Canli {
    String name;

    Canli() {
        name = "Super";
    }

    Canli(String name) {
        this.name = name;
    }
}

class Kuzu extends Canli {
    Kuzu() {
        this("Kuzu");
    }

    Kuzu(String name) {
        this.name = name;
    }
}

class Kurt extends Canli {
    Kurt() {
        super("Kurt");
    }

    Kurt(String name) {
        super.name = name;
    }
}
