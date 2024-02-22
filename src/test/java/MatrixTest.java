
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Matrix;
public class MatrixTest {
    Matrix matrix1;
    Matrix matrix2;
    Matrix matrix3 = null;
    @BeforeEach
    void setUp(){
        matrix1 = new Matrix(3);
        for (int i = 0; i < matrix1.getSize() ; i++){
            for (int j = 0; j < matrix1.getSize() ; j++){
                matrix1.set(i,j,i+j+1);
            }
        }
        matrix2 = new Matrix(3);
        for (int i = 0; i < matrix2.getSize() ; i++){
            for (int j = 0; j < matrix2.getSize() ; j++){
                matrix2.set(i,j,i+j);
            }
        }
    }
    @Test
    public void setTest(){
        matrix1.set(0,0,1);
        Assertions.assertEquals(1,matrix1.get(0,0));
    }
    @Test
    public void getTest(){
        Assertions.assertEquals(2,matrix1.get(0,1));
    }
    @Test
    public void addAnotherNullMatrix(){
        Assertions.assertThrows(NullPointerException.class,()->matrix1.add(matrix3));
    }
    @Test
    public void addAnotherMatrixWithDifferentSize(){
        matrix3 = new Matrix(4);
        Assertions.assertThrows(IllegalArgumentException.class,()->matrix1.add(matrix3));
    }
    @Test
    public void addAnotherMatrixWithSameSize(){
        matrix1.add(matrix2);
        Assertions.assertEquals(1,matrix1.get(0,0));
    }
    @Test
    public void multiplyAnotherNullMatrix(){
        Assertions.assertThrows(NullPointerException.class,()->matrix1.multiply(matrix3));
    }
    @Test
    public void multiplyAnotherMatrixWithDifferentSize(){
        matrix3 = new Matrix(4);
        Assertions.assertThrows(IllegalArgumentException.class,()->matrix1.multiply(matrix3));
    }
    @Test
    public void multiplyAnotherMatrixWithSameSize(){
        matrix1.multiply(matrix2);
        Assertions.assertEquals(8,matrix1.get(0,0));
    }
    @Test
    public void transposeTest(){
        matrix1.transpose();
        Assertions.assertEquals(2,matrix1.get(0,1));
    }
}
