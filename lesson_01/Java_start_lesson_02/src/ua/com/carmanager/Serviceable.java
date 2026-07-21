package ua.com.carmanager;

public interface Serviceable {
	//lesssow3.2 метод для визн пробега от посл ТО (default value 10000)
	//lesson3.3 abstract made
	//lesson3.4 in interface replaced
	public abstract boolean isReadyToService();
	
	public int getDistance();
	
	public void addDistance(int extradistance);
	
}
