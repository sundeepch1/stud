package observer.design.pattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		DeliveryData topic = new DeliveryData();

		Observer obj1 = new Seller();
		Observer obj2 = new User();
		Observer obj3 = new DeliveryWarehouseCenter();

		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		topic.locationChanged();

		topic.unregister(obj3);

		System.out.println();
		topic.locationChanged();

	}
}
