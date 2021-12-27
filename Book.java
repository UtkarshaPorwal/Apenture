package com.greatLearning.assignment;
public class Book {

String name;
int price;
int Genre;
int noOfCopyesSold;

public Book(String name, int price, int Genre, int noOfCopyesSold) {
	super();
	this.name = name;
	this.price = price;
	this.Genre = Genre;
	this.noOfCopyesSold = noOfCopyesSold;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getGenre() {
	return Genre;
}
public void setGenre(int genre) {
	Genre = genre;
}
public int getNoOfCopyesSold() {
	return noOfCopyesSold;
}
public void setNoOfCopyesSold(int noOfCopyesSold) {
	this.noOfCopyesSold = noOfCopyesSold;
}
}
