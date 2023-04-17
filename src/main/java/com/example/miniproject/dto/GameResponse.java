package com.example.miniproject.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameResponse {

  String description;

  String genre;

  String protagonist;

  public GameResponse(String description, String genre, String protagonist) {
    this.description = description;
    this.genre = genre;
    this.protagonist = protagonist;
  }
}
