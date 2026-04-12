class A {
    private int x = 10;
}

class B extends A {
    void show() {
        System.out.println(x);  // ❌ ERROR
    }
}




// ============Currect version=============>



class A {
    private int x = 10;

    // Getter method
    public int getX() {
        return x;
    }
}

class B extends A {
    void show() {
        System.out.println(getX()); // correct way
    }
}

public class PrivateAccessBestFix {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
