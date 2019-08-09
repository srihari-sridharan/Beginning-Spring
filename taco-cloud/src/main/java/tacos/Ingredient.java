package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
	@SuppressWarnings("unused")
	private final String id;
	@SuppressWarnings("unused")
	private final String name;
	@SuppressWarnings("unused")
	private final Type type;
	
	public static enum Type{
		WRAP,
		PROTEIN,
		VEGGIES,
		CHEESE,
		SAUCE
	}
}
