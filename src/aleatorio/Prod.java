
package aleatorio;

public class Prod {
     
    
    String codigo;
    String descricion;
    double prezo;

    public Prod() {
        codigo="";
        descricion="";
        prezo=0;
    }

    public Prod(String codigo, String descricion, double prezo) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Producto : " + "Codigo = " + codigo + ", Descricion = " + descricion + ", Prezo = " + prezo;
    }
    
    
}
