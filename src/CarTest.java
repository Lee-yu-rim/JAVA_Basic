
public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
			
			car.carType = "마티즈";
			car.carColor = "빨간색";
			car.carPerson = 4;
			car.carWheel = 4;
			car.carMax = 200;
			car.carTrunk = 50;
			car.carWeight = 500;
			car.carCeiling = 100;
			car.carFuel = 2000;
			car.fuelSize = 50;
			
			
			System.out.println("차종은 " + car.carType);
			System.out.println("자동차의 색깔은 " + car.carColor);
			System.out.println("탑승 인원 수는 " + car.carPerson + "명");
			System.out.println("바퀴의 수는 " + car.carWheel + "개");
			System.out.println("최대 시속은 " + car.carMax + "km");
			System.out.println("트렁크의 크기는 " + car.carTrunk);
			System.out.println("차의 무게는 " + car.carWeight + "kg");
			System.out.println("차의 천장은 " + car.carCeiling + "m");
			System.out.println("배기량/연비는 " + car.carFuel + "cc");
			System.out.println("연료통의 크기는 " + car.fuelSize + "L");
			
				
		
		
		
		
		
		
		
	}

}
