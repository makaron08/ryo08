package adapter;

public class hanako implements chairperson{
    private Taro taro;
    public hanako(){
        taro = new Taro();
    }
    public void organizeClass(){
        taro.enjoyWithAllClassmate();
    }
}
