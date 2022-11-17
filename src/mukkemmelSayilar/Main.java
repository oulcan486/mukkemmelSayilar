package mukkemmelSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi=28;
		int sum=0;
		
		if(sayi>0) {
			for (int i = 1; i <sayi; i++) {
				if(sayi%i==0) {
					sum+=i;
				}
			}
			
	        if(sum==sayi) {
	        	System.out.println("Mukkemmel sayi");
	        }else {
	        	System.out.println("Mukkemmel Sayi degil");
	        }
		}else {
			System.out.println("Geçersiz deger");
		}
		
		
	}

}
