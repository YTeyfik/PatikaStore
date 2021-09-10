package patikaStore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		Store patikaStore=new Store("PatikaStore");
		patikaStore.showMenu();
		int uniqueId = 0;
		int choice=scan.nextInt();
		while(true) {
			System.out.println();
			if(choice == 0) {
				System.out.println("Cikis yapiliyor...");
				break;
			}else if(choice == 1) {
				patikaStore.notebookOperations();
				int choiceNotebook = scan.nextInt();
				
				switch(choiceNotebook) {
				case 0:
					System.out.println("Ana menuye geri donuluyor...");
					break;
				case 1:
					patikaStore.listNotebook();
					break;
				case 2:
					uniqueId++;
					boolean add = patikaStore.addProduct("Notebook",uniqueId);
					if(add) {
						System.out.println("Urun basariyla eklendi.");
					}
					break;
				case 3:
					patikaStore.listNotebook();
					System.out.print("Silmek istediginiz urunun id'sini giriniz : ");
					int productId = scan.nextInt();
					boolean delete = patikaStore.deleteProduct( productId);
					if(delete) {
						System.out.println("Urun basariyla silindi.");
					}
					break;
				default:
					System.out.println("Gecersiz bir secenek!");
				}
			}else if(choice == 2) {
				patikaStore.phoneOperations();
				int choicePhone = scan.nextInt();
				switch(choicePhone) {
				case 0:
					System.out.println("Ana menuye geri donuluyor...");
					break;
				case 1:
					patikaStore.listMobilePhone();
					break;
				case 2:
					uniqueId++;
					boolean add = patikaStore.addProduct("MobilePhone",uniqueId);
					if(add) {
						System.out.println("Urun basariyla eklendi.");
					}
					break;
				case 3:
					patikaStore.listMobilePhone();
					System.out.print("Silmek istediginiz urunun id'sini giriniz : ");
					int productId = scan.nextInt();
					boolean deleted = patikaStore.deleteProduct(productId);
					if(deleted) {
						System.out.println("Urun basariyla silindi.");
					}
					break;
				default:
					System.out.println("Gecersiz bir secenek!");
				}
			}else if(choice == 3) {
				patikaStore.listBrand();
			}
			else {
				System.out.println("Gecersiz bir secenek girdiniz!");
			}
			
			System.out.println();
			patikaStore.showMenu();
			choice = scan.nextInt();
		}
	}
}

