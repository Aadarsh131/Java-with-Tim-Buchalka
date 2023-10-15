package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void plot() {
        System.out.println("no plot here");
    }

    public String getName() {
        return name;
    }

    //functions/methods that are returing some instance of a class(i.e, objects), is called FACTORY METHODS (in Design patterns world)
    public static Movie getMovie(int Sno) {
        return switch (Sno) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new StarWars();
            case 5 -> new Okja();
            default -> new Movie("No movie");
        };
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public void plot() {
        System.out.println("this is the plot of jaws");
    }

    public void watchJaws() {
        System.out.println("Watching Jaws!!!");
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependeceDay");
    }

    @Override
    public void plot() {
        System.out.println("plot of IndepenceDay");
    }

    public void watchIndependenceDay() {
        System.out.println("Watching IndependeceDay!!!");
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public void plot() {
        System.out.println("plot of MazeRunner");
    }

    public void watchMazerunner() {
        System.out.println("Watching MazeRunner!!!");
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public void plot() {
        System.out.println("plot of StarWars");
    }

    public void watchStarwars() {
        System.out.println("Watching StarWars!!!");
    }
}

class Okja extends Movie {
    public Okja() {
        super("Okja");
    }

    @Override
    public void plot() {
        System.out.println("plot of Okja");
    }

    public void watchOkja() {
        System.out.println("Watching watchOkja!!!");
    }
}

public class Main {

    public static void main(String[] args) {
        //polymorphism in action- (where before the runtime storingMovie has no particular object to run with, it only gets the object during the Runtime and sets the object according to the Factory Method's return type)
        Movie storingMovie = Movie.getMovie(1);
        System.out.println(storingMovie.getName());
        storingMovie.plot(); //NOTE: "Jaws" class plot() method is being accessed here, because of @Override
//        storingMovie.watchJaws(); //not accessible

        //casting
        Jaws mouv = (Jaws) Movie.getMovie(1); //we explicitly want the Jaws object (hence casting), Notice the type of class we are storing 'mouv' in (its not general Movie class type, its explicitly a Jaws class type)
        System.out.println("MovieName(using casting): " + mouv.getName());

        //we can assign an instance to a variable of same datatype(class) or a parents type, or a parent's parent type, including java.lang.Object, the ultimate base class
        Object unknowObjType = Movie.getMovie(4);
//        unknowObjType.plot(); // WHY its an error, on the runtime isn't `Object` supposed to get Change to its instance type (i.e, StarWares in our case)?
        System.out.println(unknowObjType.getClass().getSimpleName()); // why this is working, if `unknowObjType.plot()` is not working
        Movie movy = (Movie) unknowObjType;
        movy.plot(); // why it is working now, after casting

        //Or, we can use "var" (LVTI- Local variable Type inference)
        var obj = Movie.getMovie(3); //compile type is Movie
        obj.plot(); //runtime type is MazeRunner

        ///////////////////Evaluating the Runtime type///////////////////

    }
}
