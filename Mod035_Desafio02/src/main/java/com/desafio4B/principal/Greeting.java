package com.desafio4B.principal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id) {
		this.id = id;
		this.content = "";

	}

	public Greeting(String content) {
		this.id = 0;
		this.content = content;

	}

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
