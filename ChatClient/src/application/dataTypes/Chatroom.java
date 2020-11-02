package application.dataTypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Chatroom implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

    private int chatId;

    private ArrayList<User> users = new ArrayList<>();
    
    private ArrayList<ChatMessage> messages = new ArrayList<>();

    private User creator;

    //private ChatHistory chatHistory;

    public Chatroom(User user, String name){

        this.creator = user;
        this.name = name;

        Random rd = new Random();
        this.chatId = rd.nextInt();
    }

    public String getChatroomName() {

        return this.name;

    }

    public int getChatId() {

        return chatId;
    }

    public String getCreatorName() {

        return this.creator.getUsername();

    }

    public ArrayList<String> getUsernames() {

        ArrayList<String> usernames = new ArrayList<>();

        for(User i: users) {
            usernames.add(i.getUsername());
        }

         return usernames;

     }
    
    public String getUsersAsString() {
    	
    	String names = creator.getUsername() + " ";
    	for(User i: users) 
    	{
    		names = names.concat(i.getUsername());
    		names = names.concat(" ");
    	}
		return names;
    	
    }
/*
    public String displayMessage(User user, String message) {

        return user.getName + ": " + message;

    }
*/
    public void sendMessage(String message) {

        //chatHistory.add(displayMessage());

    }

	public ArrayList<ChatMessage> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<ChatMessage> messages) {
		this.messages = messages;
	}
	
	public void addMessage(ChatMessage message) {
		this.messages.add(message);
	}
}
