
package aleatorio;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Aleatorio {

    static RandomAccessFile fichero = null;
    
    
    
    public static void main(String[] args) throws IOException {
        
        
        File fichero = new File("aleatorio.txt");
        
        Prod obx = new Prod();
        
        
        
        
        fichero.createNewFile();
        RandomAccessFile random = new RandomAccessFile(fichero,"rw");
        
        String[] codes={"p1","p2","p3"};
        String[] descricion ={"parafusos","cravos ","tachas"};
        double[] prices ={3.0,4.0,5.0};
        
          for (int i=0;i<codes.length;i++){
                random.writeChars(String.format("%-3s",codes[i]));
                random.writeChars(String.format("%-10s",descricion[i]));
                random.writeDouble(prices[i]);
                
    }
        String acumCod="";
        String acumDes="";
        String comparar="";
        int h=2;
        int c =(h-1)*34;
        //int c=(j)*34;                           //Esta fila solo es necesaria cuando quieres que te devuelvan todo.
        random.seek(c);
            
        
        for (int i =0;i<3;i++){//Este for nos devolvera el codigo
            char a = random.readChar();
            if (!" ".equals(String.valueOf(a))){
                 acumCod=acumCod+a;
            } 
            }
            
           for (int i =0;i<10;i++){//Este bucle for nos devolvera el nombre del producto
               char a = random.readChar();
               if(!" ".equals(String.valueOf(a)))
                acumDes=acumDes+a;
                 
            }
           
          
          System.out.println(acumCod);     //Imprime el codigo acumulando los char
          System.out.println(acumDes);      //Imprime la descripcion acumulando los char
          double precio = random.readDouble();
          System.out.println(precio); //Imprime el double
          obx.setCodigo(acumCod);
          obx.setDescricion(acumDes);
          obx.setPrezo(precio);
          
          
          
          
          
          //acumCod="";      Estas dos lineas solo son necesarias sin lo      //Reiniciamos los Strings para borrar el acumulado de char
          //acumDes="";           //Reiniciamos los String para borrar el acumulado de char
        
          
             random.close();
            
       
        
    }
}