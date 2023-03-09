import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		Random random1 = new Random();
        int n,a,toplam=0;
        System.out.println("Merhaba! Matris çarpımı uygulamasına hoşgeldiniz. Skaler çarpım için 1, Vektörel çarpım için 2.");
	    a=input.nextInt();
	    System.out.println("Kaç boyutlu matris çarpımı istiyorsunuz?");
	    n=input.nextInt();
	    System.out.println("");
	    int matrisDiziBir[][]= new int[n][n];
	    int matrisDiziİki[][]= new int[n][n];
	    int matrisDiziSonuc[][]= new int[n][n];
	    int i,j,k;
	    System.out.println("1.matris:");
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            matrisDiziBir[i][j]=random1.nextInt(10)+1;
	            System.out.print(matrisDiziBir[i][j]+" ");
	        }System.out.println("");
	    }
	    System.out.println("");
	    System.out.println("2.matris:");
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            matrisDiziİki[i][j]=random1.nextInt(10)+1;
	            System.out.print(matrisDiziİki[i][j]+" ");
	        }System.out.println("");
	    }
	    System.out.println("");
	    System.out.println("Sonuç:");
	    if(a==1){
	        for(i=0;i<n;i++){
	            for(j=0;j<n;j++){
	                matrisDiziSonuc[i][j]=matrisDiziBir[i][j] * matrisDiziİki[i][j];
	                System.out.print(matrisDiziSonuc[i][j]+" ");
	            }System.out.println("");
	        }
	    }
	    if(a==2){
	        for(i=0;i<n;i++){
	            for(j=0;j<n;j++){
	                for(k=0;k<n;k++){
	                    toplam+=matrisDiziBir[i][k] * matrisDiziİki[k][j];
	                }
	                matrisDiziSonuc[i][j]=toplam;
	                toplam=0;
	                System.out.print(matrisDiziSonuc[i][j]+" ");
	            }System.out.println("");
	        }
	    }
	}   
}
