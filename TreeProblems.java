/*
 * *** KASS SEREK / COMP272 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
        // create two temporary sets to hold the elements of each set
        Set<Integer> tempA = new TreeSet<>(setA);
        Set<Integer> tempB = new TreeSet<>(setB);

        // combine both sets
        tempA.addAll(tempB);

        // create a new set for intersection
        Set<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);

        // remove the common elements from the combined set
        tempA.removeAll(intersection);

        // return the result
        return tempA;
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {
        Iterator<Integer> iterator = treeMap.keySet().iterator();

        // iterate iver the keys and remove even ones
        while (iterator.hasNext()) {
            int key = iterator.next();
            if (key % 2 == 0) {
                iterator.remove();
            }
        }
    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
        // use the equals method to compare both maps
        return tree1.equals(tree2);
    }

} // end treeProblems class
