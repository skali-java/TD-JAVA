import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Matrice {
        public static boolean isValid(String strdate, String format) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            try {
                Date date = df.parse(strdate);
                return true;
            } catch (ParseException ex) {
                Logger.getLogger(Matrice.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }

        public static void main(String[] args) {
            String dtFormat = "dd/MM/yyyy";
            String date1 = "21/09/2088";
            //Test 1
            if (Matrice.isValid(date1, dtFormat)) {
                System.out.println("Le format de " + date1 + " est correcte");
            } else {
                System.out.println(date1 + " n'est pas une date valide");
            }
        }
        //    ex2
//        public static void main(String args[]){
//            //Créer deux matrices
//            int A[][] = {{1,2},{3,4}};
//            int B[][] = {{5,6},{7,8}};
//
//            //Créer une matrice pour stocker la multiplication
//            //2 lignes et 2 colonnes
//            int C[][] = new int[2][2];
//
//            //multiplication
//            for(int i=0; i<2; i++){
//                for(int j=0; j<2; j++){
//                    C[i][j] = 0;
//                    for(int k=0; k<2 ;k++)
//                    {
//                        C[i][j] += A[i][k] * B[k][j];
//                    }
//                    System.out.print(C[i][j]+" ");
//                }
//                System.out.println();
//            }
//        }
    }

