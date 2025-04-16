package Beginner.java8;

import java.util.Optional;

public class OptionalEg {
    public static void main(String[] args) {
        //✅ Without Optional
        String name = getName();

        if (name != null) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Hello, Guest");
        }

        //✅ With Optional
        Optional<String> name1 = getNames();
        System.out.println("Hello, " + name1.orElse("Guest"));

    }

    public static String getName() {
        return null; // Simulate no name found
    }

    public static Optional<String> getNames() {
        return Optional.ofNullable(null); // Simulate no name found
    }

///🎯 Goal:Return the name of the user if it’s present, otherwise return "Unknown" — without writing if-else or null checks.

//    public String getUserName(User user) {
//        return Optional.ofNullable(user)
//                .map(User::getName)
//                .orElse("Unknown");
//    }

//    public String getUserName(User user) {
//        return Optional.ofNullable(user)
//                .map(u -> u.getName())
//                .orElse("Unknown");
//    }
}
/*
🔍 Step-by-Step Breakdown:
1. Optional.ofNullable(user)
    This creates an Optional object that may or may not contain a User.
    If user is not null → it wraps the user.
    If user is null → it creates an empty Optional.

2. .map(u -> u.getName())
    “If the user is present (not null), call getName() on it and return that value.
    If not, skip this step.”
    This avoids a NullPointerException on user.getName().
    So:
    If user exists → this returns the user's name.
    If user is null → it skips this, and the Optional is still empty.

3. .orElse("Unknown")
    “If the Optional still has a value (i.e., a name), return it.
    Otherwise, return "Unknown" as default.”
 */