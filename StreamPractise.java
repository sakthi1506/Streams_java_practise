package com.Stream;

import com.RealExample.Integrate;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractise {
    public static void main(String[] args) {

  List<Movies> movies=Arrays.asList(
          new Movies("kgf",2000,"yash"),
          new Movies("killi",2000,"vj"),
          new Movies("Beast",2020,"vj"),
          new Movies("killi",2021,"vij"));

         List<String> list=movies.stream()
                          .map(Movies::getActor)
                          .collect(Collectors.toList());

         Set<String> list1=movies.stream()
                .map(Movies::getMovieName)     // list or set returns
                .collect(Collectors.toSet());

         String li=movies.stream()
                .map(Movies::getMovieName)
                .collect(Collectors.joining(","));  // string returns
             System.out.println(li);
             System.out.println(list1);


              Map<Integer,List<Movies> > li1=movies.stream()
                      .collect(Collectors.groupingBy(Movies::getReleaseYear));   //map returns
                    System.out.println(li1);

                    Double rate=movies.stream()
                            .collect(Collectors.averagingDouble(Movies::getReleaseYear));   // double

              System.out.println(rate);


              Map<Boolean,List<Movies>>  ml=movies.stream()
                      .collect(Collectors.partitioningBy(movies1 -> movies1.getReleaseYear()>2020)); // partision by

                System.out.println(ml);


    }
}
