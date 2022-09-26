package com.br.desafio.produtos.model;

public class ImgInfo {
  private String name;
  private String url;

  public ImgInfo(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}