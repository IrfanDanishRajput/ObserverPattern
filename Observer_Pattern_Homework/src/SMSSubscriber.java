
public class SMSSubscriber implements Subscriber {
	String userInfo;

	public SMSSubscriber(String userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public void update(String s) {
		System.out.println(this.toString() + ": "+ s);
		
	}
	
	public String toString() {
		return "[ " + userInfo+" ]";
	}
}
