public class Main {

    public static void main(String[] args) {
		Workers[] persArray = new Workers[5];
		persArray = crateArray();
		printIfAgeMore(persArray,40);
    }

    static Workers[] crateArray(){
		Workers[] persArray = new Workers[5];
		persArray[0] = new Workers("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
		persArray[1] = new Workers("Vasilev Nikolay", "Welder", "vasilev@mailbox.com", "89254684", 25000, 22);
		persArray[2] = new Workers("Dubov Artem", "Manager", "dubov@mailbox.com", "892651994", 70000, 56);
		persArray[3] = new Workers("Volkov Evgenii", "Accountant", "volkov@mailbox.com", "892191291", 50000, 41);
		persArray[4] = new Workers("Zaharova Anna", "HR", "zaharova@mailbox.com", "892919146", 40000, 37);
		return persArray;
	}
	static void printIfAgeMore (Workers[] persArray, int maxAge){
    	for (int i=0; i< persArray.length; i++){
			int age = persArray[i].getAge();
			if (age>=maxAge){
				persArray[i].getFullInfo();
				System.out.println();
			}
		}
	}
}
