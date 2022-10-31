package observer;

public class AppTwitter {

	public static void main(String[] args) {

		PublicFigure ana = new PublicFigure("Ana Maria", "aninha");

		PublicFigure heider = new PublicFigure("Heider Oliveira", "oliveira");

		Follower carla = new Follower("Carla");

		Follower sandro = new Follower("Sandro");

		Follower maria = new Follower("Maria");

		ana.addSubscriber(carla);

		ana.addSubscriber(sandro);

		ana.addSubscriber(maria);
		

		heider.addSubscriber(sandro);

		heider.addSubscriber(maria);
		

		ana.tweet("Hello Friends!");

		heider.tweet("Let's learn Java!");

		ana.removeSubscriber(maria);

		ana.tweet("I'm a Java programmer!");

	}

}
