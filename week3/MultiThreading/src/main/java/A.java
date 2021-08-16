
@Table(tableName = "A")
public class A {

    private int privateIntA;
    protected int protectedIntA;
    public int publicIntA;

    @CustomAnnotation
    public void something(){

    }
}
