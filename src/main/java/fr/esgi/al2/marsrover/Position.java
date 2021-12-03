package fr.esgi.al2.marsrover;

import java.util.Objects;

public class Position {
    final int x;
    final int y;
    final int z;
    Position(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position goNorth(){
        return new Position(this.x, this.y+1, this.z);
    }

    public Position goSouth(){
        return new Position(this.x, this.y-1, this.z);
    }

    public Position goWest(){
        return new Position(this.x-1, this.y, this.z);
    }

    public Position goEast(){
        return new Position(this.x+1, this.y, this.z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
