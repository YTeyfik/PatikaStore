package patikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	Scanner scan=new Scanner(System.in);
	private String name;
	ArrayList<Product> products=new ArrayList<Product>(); 
		
	public Store(String name) {
		super();
		this.name = name;
	}
	
	
	static ArrayList<Brand> brands=new ArrayList<Brand>();

	static {
			brands.add(new Brand(1, "Samsung"));
			brands.add(new Brand(2, "Lenovo"));
			brands.add(new Brand(3, "Apple"));
			brands.add(new Brand(4, "Huawei"));
			brands.add(new Brand(5, "Casper"));
			brands.add(new Brand(6, "Asus"));
			brands.add(new Brand(7, "HP"));
			brands.add(new Brand(8, "Xiaomi"));
			brands.add(new Brand(9, "Monster"));
		}

	public void showMenu() {
		System.out.println("PatikaStore Ürün Yönetim Paneli !");
		System.out.println("1 - Notebook Islemleri");
		System.out.println("2 - Cep Telefonu Islemleri");
		System.out.println("3 - Marka Listele");
		System.out.println("0 - Cikis Yap");
		System.out.print("Tercihiniz : ");
	}
	public void notebookOperations() {
		System.out.println("Notebook Islemleri");
		System.out.println("1 - Notebook Listele");
		System.out.println("2 - Notebook ekle");
		System.out.println("3 - Notebook sil");
		System.out.println("0 - Ana menuye geri dön!");
		System.out.print("Tercihiniz : ");
	}
	public void phoneOperations() {
		System.out.println("Cep telefonu Islemleri");
		System.out.println("1 - Cep telefonu Listele");
		System.out.println("2 - Cep telefonu ekle");
		System.out.println("3 - Cep telefonu sil");
		System.out.println("0 - Ana menuye geri dön!");
		System.out.print("Tercihiniz : ");
	}
	
	public void listBrand() {
		System.out.println("Markalarimiz");
		System.out.println("--------------");
		for (Brand brand : brands) {
			System.out.println(brand.getId()+ " - " + brand.getName());
		} 
		System.out.println();
	}
	
	public boolean addProduct(String deviceName,int unique) {
		
		if(deviceName=="Notebook") {
			for(Brand brand:brands) {
				System.out.println(brand.getId()+" - "+ brand.getName());
			}
			System.out.println();
			System.out.print("Notebookun markasini seciniz: ");
			int brandIndex = scan.nextInt();
			Brand brandName = brands.get(brandIndex - 1);
			
			int id = unique;
			
			scan.nextLine();
			System.out.print("Notebookun adini giriniz: ");
			String productName = scan.nextLine();
			
			System.out.print("Notebookun birim fiyatini giriniz: ");
			double unitPrice = scan.nextDouble();
			
			System.out.print("Notebookun indirim oranini giriniz: ");
			int discountRate = scan.nextInt();
			
			System.out.print("Notebookun stok miktarini giriniz: ");
			int amountOfStock = scan.nextInt();

			System.out.print("Notebookun depolama alani miktarini giriniz: ");
			int storage = scan.nextInt();
			
			System.out.print("Notebookun ekran boyutunu giriniz: ");
			double screenSize = scan.nextDouble();
			
			System.out.print("Notebookun ram'ini giriniz: ");
			int ram = scan.nextInt();
			
			
			Product newProduct = new Notebook(deviceName,id,productName, unitPrice,brandName, 
					discountRate, amountOfStock,ram,storage, screenSize);
			products.add(newProduct);
			return true;	
		}
		else if(deviceName=="MobilePhone") {

			for(Brand brand:brands) {
				System.out.println(brand.getId()+" - "+ brand.getName());
			}
			System.out.println();
			System.out.print("Telefonun markasini seciniz: ");
			int brandIndex = scan.nextInt();
			Brand brandName = brands.get(brandIndex - 1);
			
			int id =unique;
			scan.nextLine();
			System.out.print("Telefonun adini giriniz: ");
			String productName = scan.nextLine();
			
			System.out.print("Telefonun birim fiyatini giriniz: ");
			double unitPrice = scan.nextDouble();
			
			System.out.print("Telefonun indirim oranini giriniz: ");
			int discountRate = scan.nextInt();
			
			System.out.print("Telefonun stok miktarini giriniz: ");
			int amountOfStock = scan.nextInt();
			
			System.out.print("Telefonun depolama alani miktarini giriniz: ");
			int storage = scan.nextInt();
			
			System.out.print("Telefonun ekran boyutunu giriniz: ");
			double screenSize = scan.nextDouble();
			
			System.out.print("Telefonun batarya gücünü giriniz: ");
			int bateryPower = scan.nextInt();
			
			
			System.out.print("Telefonun ram'ini giriniz: ");
			int ram = scan.nextInt();
			
			System.out.print("Telefonun rengini(Siyah,Kýrmýzý,Mavi) giriniz: \n");
			String color = scan.next();
			
			Product newProduct = new MobilePhone(deviceName,id,productName, unitPrice,brandName
					, discountRate, amountOfStock,bateryPower ,ram,storage, screenSize,  color);
			products.add(newProduct);
			return true;
		 
		}else {
			System.out.println("Yanlýþ cihaz grubu seçtiniz");
			return false;
		}

	}
	
	public boolean deleteProduct(int id) {
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getId()==id) {
				products.remove(i);
				return true;
			}else if(products.get(i).getId()==id) {
				products.remove(i);
				return true;
			}	
		}
		return false;
	}
	
	
	public void listMobilePhone() {
		System.out.println("\nCep Telefonu Listesi\n");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		System.out.println("| ID | Urun Adi                      | Fiyat     | Marka     | Depolama  | Ekran     | Batarya   | RAM       | Renk      |");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).getDeviceName()== "MobilePhone") {
					MobilePhone mobilePhone = (MobilePhone) products.get(i);
					System.out.format("| %-3d| %-30s| %-10.1f| %-10s| %-10d| %-10.1f| %-10d| %-10d| %-10s|\n",
							mobilePhone.getId(),mobilePhone.getProductName(),mobilePhone.getUnitPrice(),
							mobilePhone.getBrandName().getName(),mobilePhone.getStorage(),mobilePhone.getScreenSize(),
							mobilePhone.getBateryPower(),mobilePhone.getRam(),mobilePhone.getColor());
				}
			}
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listNotebook() {
		System.out.println("Notebook Listesi\n");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("| ID | Urun Adi                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
		System.out.print("----------------------------------------------------------------------------------------------------\n");
		
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).getDeviceName()=="Notebook") {
					Notebook notebook = (Notebook) products.get(i);
					System.out.format("| %-3d| %-30s| %-10.1f| %-10s| %-10d| %-10.1f| %-12d|\n",
									notebook.getId(),notebook.getProductName(),notebook.getUnitPrice(),
									notebook.getBrandName().getName(),notebook.getStorage(),notebook.getScreenSize(),
									notebook.getRam());
				}
			}
			
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
	
	
}
