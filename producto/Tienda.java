package producto;

public class Tienda extends PRODUCTO {
    /*DEFINICION DE LOS 4 PRODUCTOS*/
    
private PRODUCTO P1;
private PRODUCTO P2;
private PRODUCTO P3;
private PRODUCTO P4;

private double dineroCaja;
 
/*constructor*/

public Tienda(PRODUCTO P1p, PRODUCTO P2p, PRODUCTO P3p, PRODUCTO P4p)
{
    P1 = P1p;
    P2 = P2p;
    P3 = P3p;
    P4 = P4p;
    dineroCaja= 0;
}
  public int venderProducto (String nombreProducto, int cantidad ){
      int cantidadVendida = 0;
      if (P1.darNombre( ).equals(nombreProducto));
      {
          cantidadVendida = P1.vender(cantidad);
          dineroCaja = cantidadVendida *P1.precioFinal();
          }
      else if( P2*darNombre().equal(nombreProducto))
              {
              cantidadVendida=P2.vender(cantidad);
              dineroCaja = cantidadVendida * P2.precioFinal();
              
              }
      
      else if( P3*darNombre().equal(nombreProducto))
              {
              cantidadVendida=P3.vender(cantidad);
              dineroCaja = cantidadVendida * P3.precioFinal();
              
              }
      else if ( P4*darNombre().equal(nombreProducto))
              {
              cantidadVendida=P4.vender(cantidad);
              dineroCaja = cantidadVendida * P4.precioFinal();
              
              }

