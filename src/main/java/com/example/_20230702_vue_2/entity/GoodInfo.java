package com.example._20230702_vue_2.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class GoodInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //自增
  private long goodId;
  private String goodName;
  private double price;



}
