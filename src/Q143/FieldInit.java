package Q143;

public class FieldInit {
    char c;
    boolean b;
    float f;
    void printAll(){
        System.out.println("c="+c);
        System.out.println("b="+b);
        System.out.println("f="+f);
    }

    public static void main(String[] args) {
        FieldInit f=new FieldInit();
        f.printAll();
    }
}

/*    What is the result?

    A   c=
        b=false
        f=0.0

    B   c=null
        b=true
        f=0.0

    C   c=0
        b=false
        f=0.0f

    D   c=null
        b=false
        f=0.0F

        A. Option A
        B. Option B
        C. Option C
        D. Option D


        Answer: A*/



