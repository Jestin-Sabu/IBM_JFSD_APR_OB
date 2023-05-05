package com.ibm.lib;

public class Book {

	private String title;
	private Member member;

	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void status() {
		if (member == null) {
			System.out.println(title + " is not issued to any member");
		} else {
			System.out.println(title + " is issued to " + member.getName());
		}
	}
	
	public void issueBook(Member m) throws LibraryException {
		if(member == null && m.getBook() == null) {
			System.out.println(title + " has beed issued to " + m.getName());
			member = m;
			m.setBook(this);
		}
		else {
			throw new LibraryException(title + " cannot be issued");
		}
	}
	
	public void returnBook(Member m) throws LibraryException {
		if(member == m && m.getBook() == this) {
			System.out.println(title + " has been returned from " + m.getName());
			member = null;
			m.setBook(null);
		}
		else {
			throw new LibraryException(title + " cannot be returned");
		}
	}

}
