package multiplicando.arrays;

public class TamanhoDiferenteArrayException extends RuntimeException {

	private static final long serialVersionUID = 4928599035264976611L;
	 
    public TamanhoDiferenteArrayException(String message) {
        super(message);
    }
 
    public TamanhoDiferenteArrayException(Throwable t) {
        super(t);
    }
}
