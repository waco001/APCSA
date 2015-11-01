package me.gorti.week12;

import java.util.concurrent.ThreadLocalRandom;

public class RaceCar {
	public int horsepower;
	public double aerodynamicCoefficient;
	public double driverSkillCoefficient;
	public int acceleration;
	public int topspeed;
	public int carnumber;
	@Override
	public String toString() {
		return "RaceCar [horsepower=" + horsepower + ", aerodynamicCoefficient=" + aerodynamicCoefficient
				+ ", driverSkillCoefficient=" + driverSkillCoefficient + ", acceleration=" + acceleration
				+ ", topspeed=" + topspeed + "]";
	}
	public double calculateTime(){
		return 1/((horsepower+topspeed+acceleration)*aerodynamicCoefficient*driverSkillCoefficient/10)*1000;
	}
	public RaceCar(int horsepower,double d,double e,int acceleration,int topspeed){
		this.horsepower = horsepower;
		this.aerodynamicCoefficient = d;
		this.driverSkillCoefficient = e;
		this.acceleration = acceleration;
		this.topspeed = topspeed;
	}
	public RaceCar(){
		
	}
	public void GenerateSpecs(){
		this.horsepower = ThreadLocalRandom.current().nextInt(600, 750);
		this.aerodynamicCoefficient = ThreadLocalRandom.current().nextDouble(.5, .65);
		this.driverSkillCoefficient = ThreadLocalRandom.current().nextDouble(.5, .999);
		this.acceleration = ThreadLocalRandom.current().nextInt(15, 25);
		this.topspeed = ThreadLocalRandom.current().nextInt(125, 175);
	}
}