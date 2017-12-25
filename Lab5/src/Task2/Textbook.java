package Task2;

import java.io.Serializable;

public class Textbook implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String title;
	private String author;
	public Textbook(String isbn,String title,String author)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getTitle()
	{
		return this.title;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String toString()
	{
		return "Isbn:"+this.isbn+"."+"Title:"+this.title+"."+"Author:"+this.author;
	}
	public boolean equals(Object obj)
	{
		Textbook other=(Textbook)obj;
		return this.isbn.equals(other.isbn) && this.title.equals(other.title) && this.author.equals(other.author);
	}
}
