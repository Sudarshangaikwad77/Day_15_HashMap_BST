package com.bl.hashTable;

import java.util.LinkedList;

public class HashTableMain
 {

         public static void main(String[] args) {
         System.out.println("Welcome to Hash table problem solution.");
         String totalWords = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
         String[] words = totalWords.split(" ");

         MyHashTable hashTable = new MyHashTable();

         for (String word : words) {
             hashTable.add(word);
         }

         for (String word : words) {
             int frequency = hashTable.get(word);
             System.out.println(word + ": " + frequency);
         }
     }
     }