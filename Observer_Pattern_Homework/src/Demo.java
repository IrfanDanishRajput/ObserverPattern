public class Demo {
	
	public static void main(String args[]) {
		Commentry commentry = new Commentry();
		Subscriber subscriber1 = new SMSSubscriber("Ahmed Ali [Abbottabad]");
		commentry.subscribe(subscriber1);
		
		Subscriber subscriber2 = new SMSSubscriber("Irfan Khan [London]");
		commentry.subscribe(subscriber2);
		
		commentry.setDesc("Welcome to live Soccer match");
		commentry.setDesc("Current Score 0-0");
		commentry.unsubsribe(subscriber2);
		
		
		commentry.setDesc("Its a goal!!!");
		commentry.setDesc("Current Score 1-0");
		
		Subscriber subscriber3 = new SMSSubscriber("Marrie Smith [Berlin]");
		commentry.subscribe(subscriber3);
		
		commentry.setDesc("Its another goal!!!");
		commentry.setDesc("Half time Score 2-0");
	}
}
