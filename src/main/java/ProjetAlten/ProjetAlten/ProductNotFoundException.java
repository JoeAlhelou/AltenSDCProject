package ProjetAlten.ProjetAlten;

public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(Integer id) {
		super("Could not find product " + id);
	}
	

}
