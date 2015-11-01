package me.gorti.week12;

public class RaceTrack {
	public static RaceCar[] racers = new RaceCar[4+1];
	public static void calculatePlaces(){
	    for (int j = 0; j<racers.length; j++) { //http://stackoverflow.com/questions/20945237/sort-array-element-in-a-ascending-order-in-core-java
	        for (int k = 0; k < racers.length; k++){
	            if (racers[j].calculateTime() < racers[k].calculateTime()) {
	                RaceCar buffer = racers[j];
	                racers[j] = racers[k];
	                racers[k] = buffer; 
	            }
	        }
	    }
	}
}
