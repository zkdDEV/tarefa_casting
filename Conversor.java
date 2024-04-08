public class Conversor {

    public static void main(String[] args) {

        System.out.println("*************************");

        /*
            Abaixo está o Casting Explícito de um tipo Primitivo
            para um tipo Complexo(Wrapper)
        */
        System.out.println("Casting Explícito de um tipo Primitivo para um tipo Complexo(Wrapper)");
        System.out.println("int(8 bits) var - to - Integer(8 bits) var");

        int firstIntegerNumber = 1234567891;
        System.out.println(firstIntegerNumber + " - int");

        Integer secondIntegerNumber = (Integer) firstIntegerNumber;
        System.out.println(secondIntegerNumber + " - Integer");

        System.out.println("*************************");

        /*
            Abaixo está o Casting Implícito de tipos Primitivos
        */
        System.out.println("Casting Implícito de tipos Primitivos");
        System.out.println("byte(8 bits) var - to - short(16 bits) var");

        byte tinyNumber = 123;
        System.out.println(tinyNumber + " - byte");

        short smallNumber = tinyNumber;
        System.out.println(smallNumber + " - short");

        System.out.println("*************************");

        /*
            Abaixo está o Casting Explícito de tipos Primitivos
        */
        System.out.println("Casting Explícito de tipos Primitivos");
        System.out.println("long(64 bits) var - to - int(32 bits) var");

        long largeNumber = 1234567891234567892L;
        System.out.println(largeNumber + " - long");

        int normalSizeNumber = (int) largeNumber;
        System.out.println(normalSizeNumber + " - int");

        System.out.println("*************************");
    }
}
