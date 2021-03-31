
public class Main {

	public static void main(String[] args) {
		Phone samsung = new Phone();
		Phone iphone = new Phone();
		samsung.brand = "Samsung";
		samsung.operatingSystem = "AndroidOS";
		samsung.processorType = "Qualcomm Snapdragon";
		samsung.memoryGB = "12";
		System.out.println("Phone A: " + samsung.brand + "\n" + "Operating System: " + samsung.operatingSystem + "\n" + "Proceesor Type: " + samsung.processorType + "\n" + "MemoryGB : " + samsung.memoryGB);
		samsung.Function();
		
		System.out.println();
		
		iphone.brand = "Apple";
		iphone.operatingSystem = "iOS";
		iphone.processorType = "A14 Bionic";
		iphone.memoryGB = "6";
		System.out.println("Phone B: " + iphone.brand + "\n" + "Operating System: " + iphone.operatingSystem + "\n" + "Proceesor Type: " + iphone.processorType + "\n" + "MemoryGB : " + samsung.memoryGB);
		iphone.Function();	
	}     
}
