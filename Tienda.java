
public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = new Color();
		color.setNombre("rojo");
		TipoPintura tipoPintura = new TipoPintura();
		tipoPintura.setNombre("aceite");
		Pintura pintura = new Pintura();
		pintura.setCodigo("00006");
		pintura.setColor(color);
		pintura.setTipoPintura(tipoPintura);
		Empleado juan = new Empleado();
		juan.setCodigo("001");
		juan.setNombre("Juan Perez");
		juan.despachar(pintura);

	}

}
