package producto;

public class Producto {
    final public static int PAPELERIA = 1;
    final public static int MERCADO = 2;
    final public static int DROGERIA = 3;
    
    final private static double IvaPapel = 0.16;
    final private static double IvaMercado = 0.04;
    final private static double IvaDrogeria = 0.12;
    
    private int tipo;
    private String nombre;
    private double valorunitario;
    private int cantidadBodega;
    private int cantidadMin;
    private int totalProductosVendidos;
    /*contructor */
    
    public Producto (int tipo1, String nombre1, double valorunitario1, int cantidadBodega1, int cantidadMin1)
    {
     tipo = tipo1;
     nombre = nombre1;
     valorunitario = valorunitario1;
     cantidadBodega = cantidadBodega1;
     cantidadMin = cantidadMin1;
     totalProductosVendidos = 0;
     }
     /*metodos*/
     public String darNombre(){
             return nombre;}
     
     public int darTipo(){
              return tipo;}
     
     public double darValorunitario(){
         return valorunitario;}
     
     public int darcantidadBodega(){
         return cantidadBodega;}
     
     public int darCantidadmin(){
         return cantidadMin;}
     
     public int dartotalProductosVendidos(){
         return totalProductosVendidos;}
     /*vender*/
      
     public int vender ( int cantidad )
     {
         if (cantidad > cantidadBodega)
             cantidad = cantidadBodega;
         totalProductosVendidos = totalProductosVendidos + cantidad;
         cantidadBodega = cantidadBodega - cantidad;
         return cantidad;
         }
      
     /*calcular IVA*/
      
    /**
     *
     * @return
     */
    double darIva()
     {
         switch( tipo )
         {
             case PAPELERIA:
                 return IvaPapel;
             case MERCADO:
                 return IvaMercado;
             case DROGERIA:
                 return IvaDrogeria;
             default:
                 return 0;     
          }
          /*calcular precio final*/
      
 double precioFinal(){ 
         return valorunitario * (1+darIva());
     }
}}