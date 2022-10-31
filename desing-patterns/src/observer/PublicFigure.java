package observer;

import java.util.ArrayList;
import java.util.List;

public class PublicFigure implements Subject {

	protected List<Observer> observers = new ArrayList<>();
	protected String name;
	protected String handle;

	public PublicFigure(String name, String handle) {
		this.name = name;
		this.handle = "#" + handle;
	}

	public void tweet(String tweet) {
		System.out.printf("\nName: %s, Tweet: %s\n", name, tweet);
		notifySubscribers(tweet);
	}

	@Override
	public void addSubscriber(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeSubscriber(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifySubscribers(String tweet) {
		observers.forEach(observer -> observer.notification(handle, tweet));
	}

}
