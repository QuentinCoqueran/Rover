package fr.esgi.al2.marsrover;

import java.awt.desktop.SystemEventListener;
import java.util.Objects;

public class Rover {
    final Name name;
    Orientation orientation;
    Position position;

    Rover(Name name, Orientation orientation, Position position){
        this.name = name;
        this.orientation = orientation;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(name, rover.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Name getName() {
        return name;
    }

    public void move_foward() {
        switch (this.orientation){
            case North:
                this.position = this.position.goNorth();
                break;
            case South:
                this.position = this.position.goSouth();
                break;
            case West:
                this.position = this.position.goWest();
                break;
            case East:
                this.position = this.position.goEast();
                break;
        }
    }

    public void move_back() {
        switch (this.orientation){
            case North:
                this.position = this.position.goSouth();
                break;
            case South:
                this.position = this.position.goNorth();
                break;
            case West:
                this.position = this.position.goEast();
                break;
            case East:
                this.position = this.position.goWest();
                break;
        }
    }

    public void nb_rotate(Orientation orientation) {
        while (orientation != this.orientation)
        {
            rotate_left();
        }
    }

    public void rotate_left() {
        switch (this.orientation){
            case North:
                this.orientation = this.orientation.West;
                break;
            case West:
                this.orientation = this.orientation.South;
                break;
            case South:
                this.orientation = this.orientation.East;
                break;
            case East:
                this.orientation = this.orientation.North;
                break;
        }
    }

    public void rotate_right() {
        switch (this.orientation){
            case North:
                this.orientation = this.orientation.East;
                break;
            case South:
                this.orientation = this.orientation.West;
                break;
            case East:
                this.orientation = this.orientation.South;
                break;
            case West:
                this.orientation = this.orientation.North;
                break;
        }
    }
}
