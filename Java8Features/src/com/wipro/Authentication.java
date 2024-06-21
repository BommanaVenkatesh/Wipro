package com.wipro;
@FunctionalInterface
public interface Authentication {
  boolean authentication(String username,String password);
}
