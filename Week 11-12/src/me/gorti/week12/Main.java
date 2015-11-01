package me.gorti.week12;
public class Main {
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			RaceTrack.racers[i] = new RaceCar();
			RaceTrack.racers[i].GenerateSpecs();
			System.out.println("-----------");
			System.out.println("Car " + (i+1) + " raced at " + RaceTrack.racers[i].calculateTime() + " s");
			System.out.println(RaceTrack.racers[i].toString());
			RaceTrack.racers[i].carnumber = i+1;
		}
		System.out.println("-----------");
		System.out.println("-Final Results-");
		RaceTrack.calculatePlaces();
		for(int i=0; i<5; i++){
			System.out.println("Car " + RaceTrack.racers[i].carnumber + " raced at " + RaceTrack.racers[i].calculateTime() + " s");
		}
		
	}
}