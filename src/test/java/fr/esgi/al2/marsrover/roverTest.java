package fr.esgi.al2.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class roverTest {

    @Test
    public void test_rover_positon(){
        Name n1 = new Name("Perseverance");
        Rover rover1= new Rover(n1, Orientation.North, positionAt(5,5));
        Assertions.assertEquals(positionAt(5,5), rover1.getPosition());
    }

    @Test
    public void test_rover_orientation(){
        Name n1 = new Name("Perseverance");
        Rover rover1= new Rover(n1, Orientation.North, positionAt(5,5));
        Assertions.assertEquals(Orientation.North, rover1.getOrientation());
    }

    private Position positionAt(int x, int y){
        return new Position(x, y, 0);
    }

    private Position positionAt(int x, int y, int z){
        return new Position(x, y, z);
    }

    @Test
    public void test_rover_name(){
        Name n1 = new Name("Perseverance");
        Rover rover1= new Rover(n1, Orientation.North, positionAt(5,5));
        Assertions.assertEquals(n1, rover1.getName());
    }

    @Test
    public void test_rover_isthesame_rover(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(6,5));
        Rover rover2= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        Assertions.assertEquals(rover1, rover2);
    }

    @Test
    public void test_move_rover_North(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(5,6), rover1.getPosition());
    }

    @Test
    public void test_move_rover_South(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.South, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(5,4), rover1.getPosition());
    }

    @Test
    public void test_move_rover_East(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.East, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(6,5), rover1.getPosition());
    }

    @Test
    public void test_move_rover_West(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.West, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(4,5), rover1.getPosition());
    }

    @Test
    public void test_moveback_rover_North(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.move_back();
        Assertions.assertEquals(positionAt(5,4), rover1.getPosition());
    }

    @Test
    public void test_moveback_rover_South(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.South, positionAt(5,5));
        rover1.move_back();
        Assertions.assertEquals(positionAt(5,6), rover1.getPosition());
    }

    @Test
    public void test_moveback_rover_East(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.East, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(6,5), rover1.getPosition());
    }

    @Test
    public void test_moveback_rover_West(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.West, positionAt(5,5));
        rover1.move_foward();
        Assertions.assertEquals(positionAt(4,5), rover1.getPosition());
    }

    @Test
    public void test_rotate_rover_90(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.nb_rotate(Orientation.West);
        Assertions.assertEquals(Orientation.West, rover1.getOrientation());
    }

    @Test
    public void test_rotate_rover_180(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.nb_rotate(Orientation.South);
        Assertions.assertEquals(Orientation.South, rover1.getOrientation());
    }

    @Test
    public void test_rotate_rover_270(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.nb_rotate(Orientation.East);
        Assertions.assertEquals(Orientation.East, rover1.getOrientation());
    }

    @Test
    public void test_rotate_rover_360(){
        Rover rover1= new Rover(new Name("perseverance"), Orientation.North, positionAt(5,5));
        rover1.nb_rotate(Orientation.West);
        Assertions.assertEquals(Orientation.West, rover1.getOrientation());
    }
}
