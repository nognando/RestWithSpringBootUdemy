package br.com.erudio;

public class Greeting {

	private final long id;
	private final String content;

//	Para inserir GET E SET usa-se Alt + Shift + S
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}
