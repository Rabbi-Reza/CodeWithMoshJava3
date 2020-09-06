package com.nirzhor.generics;

public class User implements Comparable<User>{
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {

        // this < other -> -1 ( negative )
        // this == other -> 0
        // this > other -> 1 ( positive )

        return points - other.points;
    }

    @Override
    public String toString() {
        return "Points = " + points;
    }
}
