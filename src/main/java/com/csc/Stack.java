package com.csc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack {
  int MAX_SIZE = 5;
  ArrayList<Dish> behindArray = new ArrayList<>();
  public void push(Dish dish) {
    if (behindArray.size() >= MAX_SIZE) {
      System.out.println("The stack is full");
    }
    else {
    behindArray.add(dish);
    }
  }
  public void pop() {
    int poppedObject = behindArray.size();
    try {
      behindArray.remove(poppedObject - 1);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("There are no elements in the stack to remove");
    }
  }
  public void peek() {
    int poppedObject = behindArray.size();
    try {
      Dish printObject = behindArray.get(poppedObject - 1);
      System.out.println("The object is " + printObject);
      System.out.println("Its description is " + printObject.description);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("There are no elements in the stack to display");
    }
  }
  public int size() {
    return behindArray.size();
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    Dish dish = new Dish("plate");
    Dish dish1 = new Dish("fork");
    Dish dish2 = new Dish("knife");
    Dish dish3 = new Dish("spoon");
    Dish dish4 = new Dish("bowl");
    Dish dish5 = new Dish("spatula");
    stack.push(dish);
    stack.push(dish1);
    stack.push(dish2);
    stack.push(dish3);
    stack.push(dish4);
    stack.push(dish5);
    System.out.println(stack.size());
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
  }
}