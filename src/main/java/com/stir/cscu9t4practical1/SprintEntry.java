package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
	 private int repetitions;
	 private int recovery;
	 
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec) { 
	 super(n, d, m, y, h, min, s, dist);
    this. repetitions= rep;
    this.recovery=rec;
	}
	 
	public int getrepetitions(){
		return repetitions;
	}
	public void setterrain(int rep) {
		this.repetitions= rep;
	}
	public int getrecovery() {
		return recovery;
	}
	 public void setrecovery(int rec) {
		 this.recovery=rec;
	 }
	 public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n" +getrepetitions()+":" +getrecovery()+":";
		   return result;
	 }
	 
	 
}

