package designing;

public interface Sail {
	default void curise() {
		System.out.println("Sail::curise");
	}

	default void turn() {
		System.out.println("Sail::turn");
	}
}
