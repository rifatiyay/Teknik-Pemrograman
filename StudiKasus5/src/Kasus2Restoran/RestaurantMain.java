package Kasus2Restoran;

import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("B", "Bala-Bala", 1_000, 20);
		Restaurant.nextID();
		menu.tambahMenuMakanan("G", "Gehu", 1_000, 20);
		Restaurant.nextID();
		menu.tambahMenuMakanan("T", "Tahu", 1_000, 0);
		Restaurant.nextID();
		menu.tambahMenuMakanan("M", "Molen", 1_000, 20);
		
		System.out.println("Menu makanan:");
		menu.tampilMenuMakanan();
		
		Scanner input = new Scanner(System.in);
		int choose = 0;
		String foodCode;
		double totalPrice=0;
		int quantity;
		
		System.out.println("\nSilakan pilih makanan");
		System.out.print("Makanan (gunakan kode di sebelah kiri nama makanan) : ");
		foodCode = input.next();
		System.out.print("Jumlah: ");
		quantity = input.nextInt();
		menu.orderFood(foodCode, quantity);
		totalPrice += menu.hitungHarga(foodCode, quantity);
		menu.Summary(foodCode, quantity, totalPrice);
		
		menu.reduceStok(foodCode, quantity);
		System.out.println("\nLihat sisa stok makanan?");
		System.out.println("[1] Ya");
		System.out.println("[2] Tidak");
		choose = input.nextInt();
		if (choose == 1){
			menu.tampilMenuMakanan();
		}
		else {
			input.close();
		}
		

	}
}
