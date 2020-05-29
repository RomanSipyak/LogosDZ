package ShablonAddapter;

public class AdapterApp {
	public static void main(String[] args) {
		// 1 extends
		VectorGraphics g1 = new VectorAdapterFromRaster();
		g1.drawLine();
		g1.drawSquare();
		// 2 composition
		VectorGraphics g2 = new VectorAdapterFromRaster2(new RasterGraphics());
		g2.drawLine();
		g2.drawSquare();
	}
}

interface VectorGraphics {
	void drawLine();

	void drawSquare();
}

class RasterGraphics {
	void drawRasterLine() {
		System.out.println("darw line");
	}

	void DrawRasterSquare() {
		System.out.println("Darw square");
	}
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics {
	public void drawLine() {
		drawRasterLine();
	}

	public void drawSquare() {
		DrawRasterSquare();
	}
}

class VectorAdapterFromRaster2 implements VectorGraphics {
	private RasterGraphics g = null;//new RasterGraphics();
	VectorAdapterFromRaster2(RasterGraphics v){
		g=v;
	}

	public void drawLine() {

		g.drawRasterLine();
	}

	public void drawSquare() {
		g.DrawRasterSquare();

	}

}