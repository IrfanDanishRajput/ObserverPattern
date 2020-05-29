
public interface Publisher {
	
	void subscribe(Subscriber s);
	void unsubsribe(Subscriber s);
	void notifyAllSubscribers();
}
