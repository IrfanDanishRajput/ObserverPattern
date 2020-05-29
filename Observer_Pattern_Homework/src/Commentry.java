import java.util.ArrayList;

public class Commentry implements Publisher {
	String desc;
	ArrayList<Subscriber> subscribers;
	
	public Commentry() {
		subscribers = new ArrayList<Subscriber>();
	}

	@Override
	public void subscribe(Subscriber s) {
		subscribers.add(s);
		
	}

	@Override
	public void unsubsribe(Subscriber s) {
		subscribers.remove(s);
		
	}

	@Override
	public void notifyAllSubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(desc);
		}
		
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifyAllSubscribers();
	}
	
	
}
