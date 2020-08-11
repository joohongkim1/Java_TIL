package generic;

// Material 에서 상속받은 것들만 재료로 사용 가능
public class GenericPrinter<T> extends Material {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

	@Override
	public void doPrinting() {
	}
	

}
