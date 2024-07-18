package Main;

import java.util.List;

public class main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        // Variables
        // String pokemonName = "squirtle";
        // int numberOfPokemon = 5;
        // boolean isPokemonCool = true;
        // System.out.println(pokemonName);
        // System.out.println(numberOfPokemon);
       // System.out.println(isPokemonCool);

        // Primitive Data Types
        // Integer
        //1. byte
        //2. short
        //3. int
        //4. long

        // Floating point
        //1. float
        //2. double

        // Boolean
        // boolean

        // Character
        // char 'd'

        // int, long, byte, short
        //byte breakTheByte = 111;
        //System.out.println(Byte.MAX_VALUE);

        //short breakTheShort = 11111;
        //System.out.println(Short.MAX_VALUE);

        //int breakTheInt = 1111111111;
        //System.out.println(Integer.MAX_VALUE);

        //long breakTheLong = 1111111111;
        //System.out.println(Long.MAX_VALUE);


        // double, float
        float breakTheFloat = 3.2222222f;
        //System.out.println(breakTheFloat);
        double breakTheDouble = 3.22222224555555555666666d;
        //System.out.println(breakTheDouble);

        // division
        int integerValue = 5/2; // return 2
        //System.out.println(integerValue);
        float myFloat = 5/2;
        //System.out.println(myFloat); // return 2.0
        double myDouble = 5/2;
        //System.out.println(myDouble); // return 2.0


        // Operators and Expressions
        //int y = 3 + 3; -> expression

        //Arithmetic Operators
        // +,-,*,/,%
        int pikachuNumber = 3;
        int squirtleNumber = 4;

        int pikachSquirtleNumber = pikachuNumber + squirtleNumber;
        //System.out.println("My PikachuSquirtle Number is: " + pikachSquirtleNumber);

        // Assignment operators
        // =, +=, -=, /=, %=
        int pokemon = 5;
        int var;

        var = pokemon;
        //System.out.println("Assignment: " + var);

        var += pokemon;
        //System.out.println("Adding: " + var);

        var -= pokemon;
        //System.out.println("Subtracting: " + var);

        var *= pokemon;
        //System.out.println("Multiplying: " + var);

        var /= pokemon;
        //System.out.println("Dividing: " + var);


        // Relational Operators
        // ==, !=, >, <, >=, <=

        int pikachu = 4;
        int squirtle = 3;

        //System.out.println(pikachu == squirtle);
        //System.out.println(squirtle != pikachu);
        //System.out.println(pikachu > squirtle);
        //System.out.println(pikachu < squirtle);
        //System.out.println(pikachu >= squirtle);
        //System.out.println(pikachu <= squirtle);


        // Logical Operators
        // &&, ||, !
        //System.out.println((5 < 3) && (8 > 5));
        //System.out.println((5 > 3) && (8 > 5));

        //System.out.println((5 > 3) || (8 > 5));

        //System.out.println(!(5 == 5));
        //System.out.println(!(5 < 3));


        // Unary Operators
        // +, -, ++, --
        int num = 6;
        //num = +num;
        //System.out.println(num);
        //num = -num;
        //System.out.println(num);

        //num++;
        //System.out.println(num);
       // num--;
        //System.out.println(num);


        // Strings
        String a = "three baby beavers built a beaver damn";
        String name = "Evans";

        if (name.equals("Evans")) {
            //System.out.println("This string equals to Evans");
        } else {
           // System.out.println("This string does not match");
        }

        //System.out.println(a.length());
        //System.out.println(a.substring(6, 10));


        // If_Else Statements
        boolean isPokemonCool = true;

        if (isPokemonCool){
            //System.out.println("Pokemon is cool");
        } else {
            //System.out.println("Pokemon is not cool");
        }

        int pokeNumber = 19;
        if (pokeNumber > 5){
            //System.out.println("Pokemon number greater than 5");
        } else {
            //System.out.println("Pokemon is less than 5");
        }


        // Switch Statements
        int pokeNum = 4;
        String pokeName = "";

        switch (pokeNum){
            case 1:
                pokeName = "Bulbazer";
                break;
            case 2:
                pokeName = "Ivyser";
                break;
                case 3:
                    pokeName = "Pikachu";
                    break;
            default:
                pokeName = "Pidgey";
        }

        //System.out.println(pokeName);


        // Arrays
        int[] values = new int[100];
        values[0] = 420;
        //System.out.println(values[0]);



        // Methods calling
        //printPikachu();
        //printPikachus();
        //printPokemon("Squirtle");


        // While Loops
        int count = 0;

        while (count <= 10){
            //System.out.println(count);
            count ++;

            if (count == 10){
                break;
            }
        }



        // For Loops

        for (int i = 0; i < 100; i++){
            //System.out.println("It moved an inch: " + i);
        }

        String beaver = "beaver";
        for (int i = 0; i < beaver.length(); i++){
            //System.out.println(beaver.charAt(i));
        }



        // Stack vs. Heap
        int pokemonNum = 2; // Stack
        int pokeNum2 = 2; // stack
        Animal turtle = new Animal(); // Heap
        Animal beavers = new Animal(); // Heap



        // Classes & Objects
        Pokemon squirtles = new Pokemon();
        //System.out.println(squirtles);
        //squirtles.ConsoleLogPokemon();


        // Ternary Operator
        String favAnimal = "lion";

        //System.out.println(favAnimal == "lion" ? true : false);


        // Inheritance
        Ping ping = new Ping();
        Dns dns = new Dns();
//        ping.SendPing();
//        dns.SendDNSRequest();
//        ping.SendPacket();

        //Constructors
        Animals animals = new Animals(2);


        // Interfaces
        List worldWorstDataStructure = new  WorldWorstDataStructure();
        //System.out.println(worldWorstDataStructure.size());


        // Abstract Classes
        NetworkRequest request = new Pings();
        //request.checkDNS();
        //request.sendRequest();


        // Encapsulation
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Evans");
        System.out.println(encapsulation.getName());
    }

    // Method
    public static void printPikachu(){
        System.out.println("Pikachu!");
        System.out.println("Pikachu!!");
        System.out.println("Pikachu!!!");
    }

    public static String printPikachus(){
        return "Pikachu";
    }

    public static void printPokemon(String pokemon){
        System.out.println(pokemon);
        System.out.println(pokemon);
        System.out.println(pokemon);
    }
}
