package com.company;



class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName(){
        return name;
    }

}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "this is the plot of jaws";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependeceDay");
    }

    @Override
    public String plot() {
        return "plot of IndepenceDay";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot(){
        return "plot of MazeRunner";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot(){
        return "plot of StarWars";
    }
}

class Okja extends Movie{
    public Okja() {
        super("Okja");
    }

}
public class Main {

    public static void main(String[] args) {
	    for(int i=1; i<=10; i++){
            Movie storingMovie = randomMovie();
            System.out.println("movie #" + i + ":" + storingMovie.getName() +"\n" + "plot: " + storingMovie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 5) +1;
        System.out.println("the random no. generated is " + randomNum);
        switch (randomNum){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Okja();

        }

        return null;
    }
}
