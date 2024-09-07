class Pen {
    String colour;
    String type; // ballpen, gelpen

    // Using Function
    public void write() {
        System.out.println("I am writing");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class Aadesh {
    public static void main(String[] args) {
        // Creating objects
        Pen pen1 = new Pen();
        pen1.colour = "black";
        
        Pen pen2 = new Pen();
        pen2.type = "gelpen";
        
        pen1.printColour();
        
        pen2.printType();
    }
}

