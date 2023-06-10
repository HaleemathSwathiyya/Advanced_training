package com.example.rabbitmqchatapplication.model;

public class ChatMessage {
	
	private String sender;
    private String receiver;
    private String content;
    
    public ChatMessage() {
		// TODO Auto-generated constructor stub
	}

	public ChatMessage(String sender, String receiver, String content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	@Override
	public String toString() {
		return "ChatMessage [sender=" + sender + ", receiver=" + receiver + ", content=" + content + "]";
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
    

}
