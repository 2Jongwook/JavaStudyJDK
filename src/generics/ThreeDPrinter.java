package generics;

public class ThreeDPrinter<T extends Material> {
    //extends로 사용할 수 있는 자료형에 제한을 두어 구분한다.
    //static 키워드는 T를 사용할 수 없다.

    private T material;

    public T getMaterial(){
        return material;
    }

    public void setMaterial(T material){
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
