package com.Assignment2;

public class Main {

    public static void main(String[] args){
        IWeightable cargo = new Cargo(400);
        IWeightable person = new Person(80);
        IWeightable luggage = new Luggage(50);

        Airplane airplane = new Airplane();
        airplane.addWeightable(cargo);
        airplane.addWeightable(person);
        airplane.addWeightable(luggage);

        System.out.println("Total weight on airplane: " + airplane.getTotalWeight() + " kg");


        IShootable player = new Player(2500);
        IShootable wall = new Wall(50);
        IShootable trap = new Trap();

        Bullet bullet = new Bullet();

        // Shooting different objects
        bullet.shoot(player, 20);
        bullet.shoot(wall, 25);
        bullet.shoot(trap, 10);

        Payable employee1 = new Employee(5000);
        Payable freelancer1 = new Freelancer(50, 100); // 50 per hour for 100 hours

        PayrollSystem payroll = new PayrollSystem();
        payroll.addPayable(employee1);
        payroll.addPayable(freelancer1);

        System.out.println("Total payroll: $" + payroll.calculateTotalPayroll());
    }
}
