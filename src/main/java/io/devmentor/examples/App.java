package io.devmentor.examples;

import java.io.InputStream;

public class App {

  public static void main(String[] args) {
    InputStream fileFromResourcesAsInputStream = getFileFromResourcesAsInputStream(
        "categories.csv");
  }

  private static InputStream getFileFromResourcesAsInputStream(String filename) {
    ClassLoader classLoader = App.class.getClassLoader();
    InputStream categoriesAsStream = classLoader.getResourceAsStream(filename);

    if (categoriesAsStream == null) {
      throw new IllegalArgumentException("File " + filename + " not found");
    } else {
      return categoriesAsStream;
    }
  }
}